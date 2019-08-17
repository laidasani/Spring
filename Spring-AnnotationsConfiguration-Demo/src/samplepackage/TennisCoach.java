package samplepackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//Field DI
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	//Setter DI
	public TennisCoach()
	{
		System.out.println("Setter DI: Constructor");
	}
	
	/*@Autowired
	public void crazyMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	//Constructor DI
	/*@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
