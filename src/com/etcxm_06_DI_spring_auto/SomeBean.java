package com.etcxm_06_DI_spring_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.ToString;

@ToString
public class SomeBean {
 
   @Autowired
   private OtherBean1 bean1;
   
   @Autowired(required=false)    //类型
   @Qualifier("otherBean22222")   //通过 id或name
   private OtherBean2 bean2;
   
  /* @Autowired
	public void setXXX(OtherBean1 bean1, OtherBean2 bean2) {
		this.bean1 = bean1;
		this.bean2 = bean2;
	}*/
   
   /* @Autowired
	public void setBean1(OtherBean1 bean1) {
		this.bean1 = bean1;
	}
    
    @Autowired
	public void setBean2(OtherBean2 bean2) {
		this.bean2 = bean2;
	}*/
}
