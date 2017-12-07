package com.etcxm_09_register_anno.service.Imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etcxm_09_register_anno.dao.IUserDao;
import com.etcxm_09_register_anno.domain.User;
import com.etcxm_09_register_anno.service.IUserService;

@Service("userService")
public class UserServiceImp implements IUserService {

	@Resource(name="userDao")
	private IUserDao dao;
	@Override
	public void register(User u) {
		// TODO Auto-generated method stub
		System.out.println("注册用户");
		dao.save(u);
	}

}
