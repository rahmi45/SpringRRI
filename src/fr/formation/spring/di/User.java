package fr.formation.spring.di;

public class User implements IUser {
	
	private IPerson person;
	private String email;
	private String team;
	

//	public User(IPerson person) {
//		this.person = person;
//	}

	@Override
	public void getPerson() {
		 this.person.begain();;
	}
	
	
	public void setPerson(IPerson person) {
		this.person = person;
	}
	
	@Override
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public void start() {
		System.out.println("I am User");
		
	}
	
	public void doStart() {
		System.out.println("Start ...");
		
	}
	
	public void doEnd() {
		
		System.out.println("...End");
		
	}

}
