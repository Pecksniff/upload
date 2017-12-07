package com.etcxm_04_register_xml.Action;

import lombok.Setter;

import com.etcxm_04_register_xml.domain.User;
import com.etcxm_04_register_xml.service.UserService;

public class UserAction {
	@Setter
	private UserService service;
	
	public void register(){
		System.out.println("请求用户注册");
		service.resigter(new User());
	}

}
