package edu.kiet.AnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KotlinChild extends Languages{

	public void features()
	{
		System.out.println("It is better than Java, but based on Java");
	}
}
