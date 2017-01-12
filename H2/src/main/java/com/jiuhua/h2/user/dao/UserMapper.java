package com.jiuhua.h2.user.dao;

import java.util.List;

import com.jiuhua.h2.user.entity.User;

public interface UserMapper {

	/**
	 * 获取用户信息
	 * @return
	 */
	public List<User> find();

}
