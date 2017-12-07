package com.etcxm_09_register_anno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm_09_register_anno.action.UserAction;






@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class RegisterAnnoTest {
	
	@Autowired
	private UserAction action;
	
	@Test
	public void test1(){
		System.out.println(action);
		action.register();
	}
	
	
	
	

}
