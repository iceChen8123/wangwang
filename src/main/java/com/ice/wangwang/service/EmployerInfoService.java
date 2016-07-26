package com.ice.wangwang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ice.wangwang.bean.EmployerInfo;
import com.ice.wangwang.dao.EmployerInfoMapperExt;

@Service
public class EmployerInfoService {

	@Autowired
	private EmployerInfoMapperExt employerInfoMapperExt;

	public List<EmployerInfo> getAllEmployerInfo() {
		return employerInfoMapperExt.selectByExample(null);
	}

	public EmployerInfo getEmployerInfo(Integer id) {
		return employerInfoMapperExt.selectByPrimaryKey(id);
	}

}
