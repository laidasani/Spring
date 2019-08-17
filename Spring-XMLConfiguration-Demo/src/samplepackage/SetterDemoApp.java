package samplepackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
				
		//call method of the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call methods to get literal values
		System.out.println(theCoach.getEmailAddress1());
		System.out.println(theCoach.getTeam1());
		
		//call methods to get literal values via property file
		System.out.println(theCoach.getEmailAddress2());
		System.out.println(theCoach.getTeam2());
		//close context
		context.close();

	}

}
