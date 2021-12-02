package edu.kiet.AnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaFeatures extends Languages {
	
	@Autowired
	private Languages kotlin;
	public void features()
	{
		System.out.println("Java is highly Object Oriented Language");
		kotlin.features();
	}
	

}
