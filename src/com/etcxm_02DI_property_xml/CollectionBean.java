package com.etcxm_02DI_property_xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class CollectionBean {
	
	private Set<String> set;
	private List<String> list;
	private String[] array;
	private Map<String,String> map;
	private Properties prop;
	
	

}
