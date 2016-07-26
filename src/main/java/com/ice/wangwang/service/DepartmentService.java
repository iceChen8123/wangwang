package com.ice.wangwang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ice.wangwang.bean.Department;
import com.ice.wangwang.dao.DepartmentMapperExt;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapperExt departmentMapperExt;

	public List<Department> getAllDepartment() {
		return departmentMapperExt.selectByExample(null);
	}

	public Department getDepartment(Integer id) {
		return departmentMapperExt.selectByPrimaryKey(id);
	}

}
