package samplepackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call new swim coach methods
		
		System.out.println("Email is "+ theCoach.getEmail());
		System.out.println("Team is "+ theCoach.getTeam());
		//close the context 
		context.close();

	}

}
