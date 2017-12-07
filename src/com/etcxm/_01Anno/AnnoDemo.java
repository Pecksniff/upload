package com.etcxm._01Anno;

import java.util.Date;
import java.util.List;
import java.util.Set;

@SuppressWarnings({ "rawtypes", "unused" })
public class AnnoDemo extends Object {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	//@SuppressWarnings({ "rawtypes", "unused" })
	public void show(){
		
		List list = null;
		//@SuppressWarnings({ "rawtypes", "unused" })
		Set set = null;
	}
	
	//@SuppressWarnings({ "rawtypes", "unused" })
    public void show1(){
		
		List list = null;
		//@SuppressWarnings({ "rawtypes", "unused" })
		Set set = null;
	}
    
	//@SuppressWarnings({ "rawtypes", "unused" })
    public void show2(){
		
		List list = null;
		//@SuppressWarnings({ "rawtypes", "unused" })
		Set set = null;
		
		show3();
	}
    
    //把show3设置为过时的方法
    @Deprecated
    public void show3(){
    	java.util.Date d = new Date();
    	d.getDate();
    }
	
	

}
