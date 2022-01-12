package fr.formation.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainNoXml {

	public static void main(String[] args) {
		// load the spring configuration file 
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SpringConfig2.class);
		
//		IMaster im = context.getBean("master" , IMaster.class);
//		im.name();
//		im.getSport();
		
		IMaster im = context.getBean("myMaster" , IMaster.class);
		
		//System.out.println(im);
	    im.name();
		im.getSport();
		
		context.close();

		

	}

}
