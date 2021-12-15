package fr.formation.spring.di;

public class User implements IUser {
	
	private IPerson person;
	

	public User(IPerson person) {
		this.person = person;
	}

	@Override
	public void getPerson() {
		 this.person.begain();;
	}

	@Override
	public void start() {
		System.out.println("I am User");
		
	}

}
