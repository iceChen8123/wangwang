package com.ice.wangwang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ice.wangwang.bean.User;
import com.ice.wangwang.dao.UserMapperExt;

@Service
public class UserService {

	@Autowired
	private UserMapperExt userMapperExt;

	public void save(User user) {
		userMapperExt.insert(user);
	}

	public List<User> getUsers() {
		return userMapperExt.selectByExample(null);
	}

}
