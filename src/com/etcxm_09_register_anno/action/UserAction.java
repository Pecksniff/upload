package com.etcxm_09_register_anno.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.etcxm_09_register_anno.domain.User;
import com.etcxm_09_register_anno.service.IUserService;
//<bean id = class="">
@Controller("userAction")
public class UserAction {
	
   @Autowired
   @Qualifier("userService")
   private IUserService service;
   public void register(){
	   
	   System.out.println("请求用户注册");
	   service.register(new User());
   }
  
  
}
