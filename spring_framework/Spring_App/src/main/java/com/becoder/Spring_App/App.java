package com.becoder.Spring_App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/Spring_App/config.xml");

		System.out.println(context);
	}
}
