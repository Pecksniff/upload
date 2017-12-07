package com.etcxm_05_bean_extends_xml;

import lombok.Setter;

public class EmployeeDao extends DaoSuppet {
	
	
	public void save(){
		System.out.println(connection);
		System.out.println("保存员工");
	}
}
