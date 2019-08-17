package samplepackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
// @ComponentScan("samplepackage")
public class SportConfig {
	
	//define bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//define bean for swim coach and inject the dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
