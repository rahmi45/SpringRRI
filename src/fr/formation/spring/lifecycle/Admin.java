package fr.formation.spring.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Admin implements IPerson {

	@Override
	public void name() {
		System.out.println("I am Admin");
		
	}

}
