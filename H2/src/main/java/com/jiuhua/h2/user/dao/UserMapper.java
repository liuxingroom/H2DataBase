package com.jiuhua.h2.user.dao;

import java.util.List;

import com.jiuhua.h2.user.entity.User;

public interface UserMapper {

	/**
	 * ��ȡ�û���Ϣ
	 * @return
	 */
	public List<User> find();

}
