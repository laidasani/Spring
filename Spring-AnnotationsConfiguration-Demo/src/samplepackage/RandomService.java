package samplepackage;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	
	private String[] data= {
		"Abc","Def","Ghi"
	};
	
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		
		int index=myRandom.nextInt(data.length);
		return data[index];
	}

}
