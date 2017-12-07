package com.etcxm_02DI_property_xml;

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




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class PropertyByXmlTest {
	
	@Autowired
	private Employee emp;
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private CollectionBean bean;
	
	@Test
	public void test1(){
		//System.out.println(emp);
		//System.out.println(service);
		System.out.println(bean);
	}
	
	
	
	

}
