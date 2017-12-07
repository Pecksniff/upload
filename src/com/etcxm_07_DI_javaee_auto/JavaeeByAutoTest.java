package com.etcxm_07_DI_javaee_auto;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm_04_register_xml.Action.UserAction;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class JavaeeByAutoTest {
	
	@Resource
	private ApplicationContext ctx;
	
	@Test
	public void test1(){
		System.out.println(ctx.getBean("someBean"));
	}
	
	
	
	

}
