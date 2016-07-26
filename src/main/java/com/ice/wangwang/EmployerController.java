package com.ice.wangwang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ice.wangwang.service.EmployerService;

@Controller
@RequestMapping(value = "employer")
public class EmployerController {

	@Autowired
	private EmployerService employerService;

	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	public Object getAllEmployer() {
		return employerService.getAllEmployer();
	}

	@RequestMapping(value = "getbyid", method = RequestMethod.GET)
	@ResponseBody
	public Object getEmployer(Integer id) {
		return employerService.getEmployer(id);
	}
}
