package edu.kiet.springfirst;

public class Faculty {
	String name;
	String specialization;
	String department;
	Faculty(String name, String specialization, String department)
	{
		this.name=name;
		this.specialization=specialization;
		this.department=department;
	}
	void displayInfo()
	{
		System.out.println("Faculty name="+name+", Specialization="+specialization+",Department="+department);
	}

}
