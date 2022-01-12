package fr.formation.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLifeCycle {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
						
		// Retrieve Bean from spring container
//		IMaster ms = context.getBean("master", IMaster.class);
				
//		ISport sp = context.getBean("tennisSport", ISport.class);
		// Retrieve Bean from spring container
		IPerson admin1 = context.getBean("admin", IPerson.class);
		
		// Retrieve Bean from spring container
		IPerson admin2 = context.getBean("admin", IPerson.class);
		
		System.out.println(admin1);//admin1.name();
		System.out.println(admin2);
		System.out.println(admin1 == admin2);
				

				
		context.close();

	}

}
