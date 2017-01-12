package com.jiuhua.h2.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuhua.h2.user.entity.User;
import com.jiuhua.h2.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping("/ll/find")
	@ResponseBody
	public List<User> find(){
		List<User> users=userService.find();
		System.out.println("controller");
		return users;
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public List<User> findAll(){
		List<User> users=userService.find();
		System.out.println("controller");
		return users;
	}
}
