package samplepackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container (will run when tennisCoach bean created or component scanning is on
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context 
		context.close();

	}

}
