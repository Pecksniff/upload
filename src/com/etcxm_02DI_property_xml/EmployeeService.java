package com.etcxm_02DI_property_xml;

import lombok.Setter;
import lombok.ToString;

@ToString
public class EmployeeService {
	@Setter
	private EmployeeDao dao;

}
