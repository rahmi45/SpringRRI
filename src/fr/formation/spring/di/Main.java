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
		
		IUser user1 = context.getBean("user", User.class);
		
		System.out.println(user);
		System.out.println(user1);
		System.out.println(user == user1);
		//Call methods on the Bean
		//user.start();
		//user.getPerson();
		//System.out.println(user.getEmail()+ " - " + user.getTeam() ); 
		
//		IPerson person = context.getBean("person", Person.class);
//		person.begain();
		
		
		context.close();
	}

}
