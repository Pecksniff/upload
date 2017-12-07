package com.etcxm_04_register_xml.dao;

import com.etcxm_04_register_xml.domain.User;

import lombok.Setter;

public class UserDao {

	@Setter
	private String connection;
	
	public void save(User u){
		System.out.println(connection);
		System.out.println("保存用户");
	}
}
