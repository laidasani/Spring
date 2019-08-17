package samplepackage;

public class TrackCoach implements Coach
{
	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService) { 
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach Here "+fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Startup Stuff going");
	}
	
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("Cleanup Stuff going");
	}
}
