package com.spring.bean.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class C {

	@Autowired
	private A a;

	public C(A a) {
		super();
		System.out.println("This is inside class C ...");
		this.a = a;
	}
	
}
