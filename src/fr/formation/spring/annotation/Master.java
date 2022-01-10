package fr.formation.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("master")
public class Master implements IMaster {
	
	@Autowired
	@Qualifier("client")
	private ICompany iC;
	
	
//	public Master(ICompany iC) {
//		this.iC = iC;
//	}

	@Override
	public void name() {
		iC.Start();

		
	}

	@Override
	public void callMysSport() {
		// TODO Auto-generated method stub
		
	}
	
//	@Autowired
//	private ISport spInterface;
//	
////	@Autowired
////	public Master(ISport spInterface) {
////		this.spInterface = spInterface;
////	}
//
////	@Autowired
////	public void setSpInterface(ISport spInterface) {
////		this.spInterface = spInterface;
////	}
//
//	
//	@Override
//	public void name() {
//		System.out.println("I am Master");
//		
//	}
//
//
//	@Override
//	public void callMysSport() {
//		spInterface.mySport();
//	}
//	
//	
	

}
