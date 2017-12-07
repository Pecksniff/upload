package com.etcxm_09_register_anno.dao.Imp;

import org.springframework.stereotype.Repository;

import com.etcxm_09_register_anno.dao.IUserDao;
import com.etcxm_09_register_anno.domain.User;

@Repository("userDao")
public class UserDaoImp implements IUserDao {

	private String connection = "连接数据库";
	
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		System.out.println(connection);
		System.out.println("保存用户");
	}

}
