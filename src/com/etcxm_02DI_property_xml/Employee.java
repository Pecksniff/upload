package com.etcxm_02DI_property_xml;

import java.net.URL;


import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	private URL  url;

}
