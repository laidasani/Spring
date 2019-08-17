package samplepackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call method of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//new method via DI Constructor
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();
	}

}
