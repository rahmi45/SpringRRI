package fr.formation.spring.annotation;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements IMaster {

	@Override
	public void name() {
		System.out.println("I am Master");
		
	}
	

}
