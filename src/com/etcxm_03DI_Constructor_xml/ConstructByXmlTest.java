package com.etcxm_03DI_Constructor_xml;

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

public class ConstructByXmlTest {
	
	@Autowired
	private Employee emp;  //简单类型
	
	@Autowired
	private EmployeeService service; //复合类型
	
	@Autowired
	private CollectionBean bean;  //集合类型
	
	@Test
	public void test1(){
		//System.out.println(emp);
		//System.out.println(service);
		System.out.println(bean);
	}
	
	
	
	

}
