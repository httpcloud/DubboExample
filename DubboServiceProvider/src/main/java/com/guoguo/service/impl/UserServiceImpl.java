package com.guoguo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.guoguo.model.User;
import com.guoguo.service.UserService;


@org.springframework.stereotype.Service
@Service(version = "1.0.0", timeout = 3000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List getUsers() {
		List list = new ArrayList();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("男");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("女");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("女");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

}
