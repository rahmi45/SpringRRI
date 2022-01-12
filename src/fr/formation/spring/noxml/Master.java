package fr.formation.spring.noxml;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component
public class Master implements IMaster {
	
	//@Autowired
	//@Qualifier("foot")
	private ISport sp;
	

	public Master(ISport sp) {
		this.sp = sp;
	}


	@Override
	public void name() {
		System.out.println("I am Master !");
		
	}

	@Override
	public void getSport() {
		sp.mySport();
	}


}
