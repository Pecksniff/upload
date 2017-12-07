package com.etcxm_04_register_xml.service;

import lombok.Setter;

import com.etcxm_04_register_xml.dao.UserDao;
import com.etcxm_04_register_xml.domain.User;

public class UserService {
	@Setter
	private UserDao dao;
	
	public void resigter(User u){
		System.out.println("注册用户");
		dao.save(u);
	}

}
