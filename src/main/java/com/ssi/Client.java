package com.ssi;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.start();
		Test t=(Test)context.getBean("myObj");
		t.show();;
		context.stop();
		
	}

}
