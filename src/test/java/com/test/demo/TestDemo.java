package com.test.demo;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gray.user.entity.User;
import com.gray.user.service.UserService;
import com.gray.user.service.impl.UserServiceImpl;

public class TestDemo {
	
	@Test
	public void test() {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService userService= ctx.getBean(UserServiceImpl.class);
		DataSource data=(DataSource) ctx.getBean("dataSource");
		System.out.println(data);
		User user=new User();
		user.setUsername("qq");
		user.setPassword("qq");
		System.out.println(userService.doUserLogin(user));
		//System.out.println(user);
		//userService.insertUser(user);
		
		
	}

}
