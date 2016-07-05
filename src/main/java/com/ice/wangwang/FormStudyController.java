package com.ice.wangwang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormStudyController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private static final String FORMSTUDY_DIRECTORY = "formstudy/";

	@RequestMapping(value = "formstudy", method = RequestMethod.GET)
	public String toformstudy() {
		return FORMSTUDY_DIRECTORY + "formstudy";
	}

	@RequestMapping(value = "todemo1", method = RequestMethod.GET)
	public String todemo1() {
		return FORMSTUDY_DIRECTORY + "demo1";
	}

	@RequestMapping(value = "todemo2", method = RequestMethod.GET)
	public String todemo2() {
		return FORMSTUDY_DIRECTORY + "demo2";
	}
}
