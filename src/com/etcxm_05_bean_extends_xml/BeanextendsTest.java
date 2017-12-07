package com.etcxm_05_bean_extends_xml;

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

import com.etcxm_04_register_xml.Action.UserAction;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class BeanextendsTest {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao  departmentDao;
	
	@Test
	public void test1(){
		/*System.out.println(employeeDao);
		System.out.println(departmentDao);*/
		employeeDao.save();
		
		departmentDao.save();
	}
	
	
	
	

}
