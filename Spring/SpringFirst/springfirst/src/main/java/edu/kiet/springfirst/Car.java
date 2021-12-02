package edu.kiet.springfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Faculty f;

	public void display()
	{
		System.out.println("This is Car Anotation");
		f.displayInfo();
	}
}
