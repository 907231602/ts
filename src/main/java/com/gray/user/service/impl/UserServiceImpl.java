package com.gray.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gray.user.dao.UserDao;
import com.gray.user.entity.User;
import com.gray.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao<User> userdao;
	
	public boolean doUserLogin(User user) {
		List<User> list = userdao.selectId(user.getUsername());
		if(list.size() == 0){
			return false;
		}else{
			if(list.get(0).getPassword().equals(user.getPassword())){	
				System.out.println("====="+list.get(0).getPassword());
				return true;
			}else{
				return false;
			}			
		}
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("--->");
		userdao.insertUser(user);
		
	}	
}

