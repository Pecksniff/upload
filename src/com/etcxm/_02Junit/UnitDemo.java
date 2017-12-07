package com.etcxm._02Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitDemo {
	
	@Before
	public void init(){
		System.out.println("....init......");
	}
	
	@After
	public void destroy(){
		System.out.println(".....destroy...");
	}
	
	@Test
	public void show(){
		System.out.println("你好");
	}
	
	@Test
	public void show1(){
		System.out.println("你好1");
	}
	
//	public static void main(String[] args) {
//		UnitDemo u = new UnitDemo();
//		u.show();
//	}

}
