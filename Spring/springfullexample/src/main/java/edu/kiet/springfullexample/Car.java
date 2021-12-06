package edu.kiet.springfullexample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{

    
	public void info()
	{
		System.out.println("This is car");
	}

}
