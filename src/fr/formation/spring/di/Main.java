package fr.formation.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		/*
		 * implémentation en java 
		 * 
		 */
//		User us = new User();
//		Person p = new Person();
//		us.setPerson(p);
//		us.getPerson();
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from spring container
		IUser user = context.getBean("user", User.class);
		//Call methods on the Bean
		//user.start();
		user.getPerson();
		
//		IPerson person = context.getBean("person", Person.class);
//		person.begain();
		
		
		context.close();
	}

}
