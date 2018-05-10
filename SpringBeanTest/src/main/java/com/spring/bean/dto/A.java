package com.spring.bean.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "BeanA")
public class A {

	{
		System.out.println("This instance block of class A ...");
	}
	private B b;
	
	@Autowired
	public A(@Lazy B b) {
		super();
		System.out.println("This is inside class A ...");
		this.b = b;
	}

	/*public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("This is setB() B class method ...");
	}*/

}
