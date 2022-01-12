package fr.formation.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig2 {
	
	@Bean
	public IMaster myMaster() {
		//Master ms = new Master();
		return new Master(mySport());
		
	}
	
	@Bean
	public ISport mySport() {
		return new Sport();
	}

}
