package com.etcxm._04Ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	
	/*@Test
	public void testOld(){
		//使用new 创建对象
		HelloWorld world = new HelloWorld();
		world.setUsername("张芳芳");
		world.sayHello();
	}*/
	
	
	@Test
	public void testIoc(){
		//ioc将创建对象的控制权交给Spring容器
		
		//1.从classpath根路径获取和加载资源文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//2.创建Spring 容器对象
		BeanFactory factory = new XmlBeanFactory(resource) ;
		//3.从容器对象中根据指定id获取对象
		HelloWorld world = (HelloWorld)factory.getBean("HelloWorld");
		//4.自己操作
		world.sayHello();
	}

}
