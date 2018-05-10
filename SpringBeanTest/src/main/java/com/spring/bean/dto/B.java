package com.spring.bean.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "BeanB")
public class B {

	{
		System.out.println("This instance block of class B ...");
	}
	private A a;

	@Autowired
	public B(A a) {
		super();
		System.out.println("This is inside class B ...");
		this.a = a;
	}

/*	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("This is setA() A class method ...");
	}
*/
}
