package com.etcxm_08_Ioc_auto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.ToString;

@ToString

/*<bean id="someBean" class="com.etcxm_08_Ioc_auto.SomeBean" 
scope="prototype"   init-method="open" destroy-method="close">*/
//@Component
@Service
//@Scope("prototype")  //作用域
public class SomeBean {
 
   @Resource
   private OtherBean1 bean1;
   
   
   @PostConstruct
	public void open() {
      System.out.println("init");
	}
   
   @PreDestroy
   public void close(){
	  System.out.println("destroy"); 
   }
   
   public void doWork(){
	   System.out.println("工作中.....");
   }
  
}
