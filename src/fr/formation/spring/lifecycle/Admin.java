package fr.formation.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin implements IPerson {
	
	@PostConstruct
	public void init() {
		System.out.println("connected with DB !! ");
	}
	@Override
	public void name() {
		System.out.println("I am Admin");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Not connected with DB !!!");
	}

}
