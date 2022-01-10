package fr.formation.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAnnotation {

	public static void main(String[] args) {

		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// Retrieve Bean from spring container
//		IMaster ms = context.getBean("master", IMaster.class);
		
//		ISport sp = context.getBean("tennisSport", ISport.class);
		
		IMaster iM = context.getBean("master", IMaster.class);
		//ms.name();
//		ms.callMysSport();
//		sp.mySport();
		iM.name();
		
		context.close();

	}

}
