package fr.formation.spring.noxml;

import org.springframework.stereotype.Component;

//@Component
public class Foot implements ISport{

	@Override
	public void mySport() {
		System.out.println("I am Foooot !!!");
				
	}

}
