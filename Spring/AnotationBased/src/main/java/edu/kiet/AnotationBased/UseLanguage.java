package edu.kiet.AnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class UseLanguage extends Languages {
	@Autowired
	private Languages kotlin;
	public void features()
	{
		System.out.println("Use Java for Object Oriented Programming");
		kotlin.features();
	}

}
