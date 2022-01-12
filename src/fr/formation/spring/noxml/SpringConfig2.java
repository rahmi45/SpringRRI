package fr.formation.spring.noxml;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("fr.formation.spring.noxml")
public class SpringConfig2 {
	
//	@Bean
//	public IMaster myMaster() {
//		//Master ms = new Master();
//		return new Master(mySport());
//		
//	}
//	
//	@Bean
//	public ISport mySport() {
//		return new Sport();
//	}

}
