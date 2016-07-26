package com.ice.wangwang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ice.wangwang.service.EmployerInfoService;

@Controller
@RequestMapping(value = "employerinfo")
public class EmployerInfoController {

	@Autowired
	private EmployerInfoService employerInfoService;

	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	public Object getAllEmployerInfo() {
		return employerInfoService.getAllEmployerInfo();
	}

	@RequestMapping(value = "getbyid", method = RequestMethod.GET)
	@ResponseBody
	public Object getEmployerInfo(Integer id) {
		return employerInfoService.getEmployerInfo(id);
	}
}
