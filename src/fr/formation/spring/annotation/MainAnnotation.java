package fr.formation.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAnnotation {

	public static void main(String[] args) {

		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// Retrieve Bean from spring container
//		IMaster ms = context.getBean("master", IMaster.class);
		
		ISport sp = context.getBean("tennisSport", ISport.class);
		
		//ms.name();
		sp.mySport();
		
		context.close();

	}

}
