package fr.formation.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class User implements ICompany {

	@Override
	public void Start() {
		System.out.println("I am User");
		
	}

}
