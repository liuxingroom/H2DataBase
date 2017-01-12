package com.jiuhua.h2.user.service;

import java.util.List;

import com.jiuhua.h2.user.entity.User;

public interface UserService {

	/**
	 * 查询用户信息
	 * @return
	 */
	public List<User> find();

}
