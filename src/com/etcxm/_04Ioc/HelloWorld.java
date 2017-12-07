package com.etcxm._04Ioc;

import lombok.Setter;

public class HelloWorld {
	@Setter
    private String username;
	 
	public void sayHello(){
		System.out.println("你好 ,世界"+username);
	}
}
