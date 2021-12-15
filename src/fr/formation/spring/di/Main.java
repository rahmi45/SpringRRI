package fr.formation.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IUser user = context.getBean("user", User.class);
		//user.start();
		user.getPerson();
		
//		IPerson person = context.getBean("person", Person.class);
//		person.begain();
		
		
		context.close();
	}

}
