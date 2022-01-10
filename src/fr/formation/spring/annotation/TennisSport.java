package fr.formation.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class TennisSport implements ISport {

	@Override
	public void mySport() {
		System.out.println("I am Tennis. ! ");
		
	}

}
