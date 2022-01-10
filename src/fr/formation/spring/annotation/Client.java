package fr.formation.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Client implements ICompany {

	@Override
	public void Start() {
		System.out.println("I am Client");
		
	}

}
