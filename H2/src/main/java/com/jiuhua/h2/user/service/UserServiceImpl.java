package com.jiuhua.h2.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiuhua.h2.user.dao.UserMapper;
import com.jiuhua.h2.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	UserMapper userMapper;
	
	@Override
	public List<User> find() {
		List<User> users=userMapper.find();
		System.out.println("service");
		return users;
	}
	
}
