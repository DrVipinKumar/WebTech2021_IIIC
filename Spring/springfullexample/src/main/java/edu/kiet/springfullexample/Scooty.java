package edu.kiet.springfullexample;

import org.springframework.beans.factory.annotation.Autowired;

public class Scooty implements Vehicle {

	String name;
	String model;
	@Autowired
	Vehicle car1;
	Scooty(String name,String model)
	{
		this.name=name;
		this.model=model;
	}
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Name="+name+"\nModel="+model);
		car1.info();
		
	}
	

}
