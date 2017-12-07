package com.etcxm_03DI_Constructor_xml;

import java.net.URL;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	private URL  url;

}
