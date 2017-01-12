package com.jiuhua.h2.test;

import java.util.List;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiuhua.h2.user.dao.UserMapper;
import com.jiuhua.h2.user.entity.User;
import com.jiuhua.h2.user.service.UserServiceImpl;
import com.jiuhua.h2.user.service.UserService;

public class H2ConnectionTest {
	
	@Test
	public void h2ConnectionTest(){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		SqlSessionFactoryBean bean=applicationContext.getBean(SqlSessionFactoryBean.class);
//		System.out.println(bean.getClass());
		UserService service=applicationContext.getBean(UserService.class);
		System.out.println(service);
		List<User> users= service.find();
		for(User user:users){
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getCreateTime());
		}
	}
}
