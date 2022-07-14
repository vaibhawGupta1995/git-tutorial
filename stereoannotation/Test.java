package com.stereoannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereoannotation/stereo.xml");
		
		Student s1=(Student)context.getBean("student");
		//s1.setName("Ajnabi Singh");
		System.out.println(s1);
	}

}
