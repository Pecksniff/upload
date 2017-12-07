package com.etcxm_03DI_Constructor_xml;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeService {
	
	private EmployeeDao dao;

}
