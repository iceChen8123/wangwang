package com.ice.wangwang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ice.wangwang.service.DepartmentService;

@Controller
@RequestMapping(value = "department")
public class DepartmentController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	public Object getAllDepartment() {
		return departmentService.getAllDepartment();
	}

	@RequestMapping(value = "getbyid", method = RequestMethod.GET)
	@ResponseBody
	public Object getDepartment(Integer id) {
		return departmentService.getDepartment(id);
	}

}
