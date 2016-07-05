package com.ice.wangwang;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.ice.wangwang.bean.User;
import com.ice.wangwang.service.UserService;
import com.ice.wangwang.util.Response;

@Controller
@RequestMapping(value = "user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private static final String FILE_CACHE = "C:/file";

	@Autowired
	private UserService userService;

	@RequestMapping(value = "add/old", method = RequestMethod.POST)
	// TODO 修改webxml，乱码bug
	public ModelAndView addUserOld(User user, @RequestParam(value = "photo", required = false) MultipartFile file) {

		String newName = "";
		if (file != null) {
			newName = saveFile(file);
		}

		logger.info("同步addUser: {}", JSON.toJSONString(user));

		user.setPhotopath(newName);
		userService.save(user);
		return new ModelAndView("redirect:/hello");
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public Object addUser(User user) {
		logger.info("异步addUser: {}", JSON.toJSONString(user));
		try {
			userService.save(user);
		} catch (Exception e) {
			logger.error("addUser failed: ", e);
			return Response.failResponse("新增失败");
		}
		return Response.successResponse("新增成功");
	}

	@RequestMapping(value = "list", method = RequestMethod.POST)
	@ResponseBody
	public Object getUsers() {
		return Response.successResponse(userService.getUsers());
	}

	private String saveFile(MultipartFile file) {
		String fileType = file.getOriginalFilename().split("\\.")[1];
		String newName = UUID.randomUUID().toString() + "." + fileType;
		if (!new File(FILE_CACHE).exists()) {
			new File(FILE_CACHE).mkdir();
		}
		File targetFile = new File(FILE_CACHE, newName);
		try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			logger.error("upload: ", e);
		} catch (IOException e) {
			logger.error("upload: ", e);
		}
		logger.info("上传照片类型:" + getFormatName(targetFile) + ",原名称:" + file.getOriginalFilename() + ";保存名:" + newName);
		return FILE_CACHE + newName;
	}

	private static String getFormatName(Object o) {
		try {
			// Create an image input stream on the image
			ImageInputStream iis = ImageIO.createImageInputStream(o);
			// Find all image readers that recognize the image format
			Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
			if (!iter.hasNext()) {
				// No readers found
				return null;
			}
			// Use the first reader
			ImageReader reader = iter.next();
			// Close stream
			iis.close();
			// Return the format name
			return reader.getFormatName();
		} catch (IOException e) {
			//
		}
		// The image could not be read
		return null;
	}

}
