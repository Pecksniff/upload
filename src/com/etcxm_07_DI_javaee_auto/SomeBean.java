package com.etcxm_07_DI_javaee_auto;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
public class SomeBean {
 
   @Resource
   private OtherBean1 bean1;
   
   @Resource(name="otherBean222")
   private OtherBean2 bean2;
   
  
}
