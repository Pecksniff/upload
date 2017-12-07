package com.etcxm_01DI_autowire_xml;

import lombok.Setter;
import lombok.ToString;

@ToString
public class SomeBean {
	@Setter
	private OtherBean other;
	
}
