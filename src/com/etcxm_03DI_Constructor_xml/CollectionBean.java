package com.etcxm_03DI_Constructor_xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CollectionBean {
	
	private Set<String> set;
	private List<String> list;
	private String[] array;
	private Map<String,String> map;
	private Properties prop;
	
	

}
