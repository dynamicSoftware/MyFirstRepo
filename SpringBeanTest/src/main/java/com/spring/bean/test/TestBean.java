package com.spring.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.dto.A;

public class TestBean {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("servlet-context.xml");

		A a=(A)context.getBean("BeanA");
		
		System.out.println("Value is : "+a);
		
	}

}
