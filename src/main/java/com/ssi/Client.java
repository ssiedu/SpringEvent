package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("e:\\conf\\spring.xml"));
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		//Test t=(Test)factory.getBean("myObj");
		//ApplicationContext context=new FileSystemXmlApplicationContext("e:\\conf\\spring.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Test t=(Test)context.getBean("myObj");
		t.show();
	}

}
