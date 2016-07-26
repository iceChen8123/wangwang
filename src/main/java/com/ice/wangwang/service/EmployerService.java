package com.ice.wangwang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ice.wangwang.bean.Employer;
import com.ice.wangwang.dao.EmployerMapperExt;

@Service
public class EmployerService {

	@Autowired
	private EmployerMapperExt employerMapperExt;

	public List<Employer> getAllEmployer() {
		return employerMapperExt.selectByExample(null);
	}

	public Employer getEmployer(Integer id) {
		return employerMapperExt.selectByPrimaryKey(id);
	}

}
