package fr.formation.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements IMaster {
	
	private ISport spInterface;
	
	@Autowired
	public Master(ISport spInterface) {
		this.spInterface = spInterface;
	}

	@Override
	public void name() {
		System.out.println("I am Master");
		
	}

	@Override
	public void callMysSport() {
		spInterface.mySport();
	}
	
	
	

}
