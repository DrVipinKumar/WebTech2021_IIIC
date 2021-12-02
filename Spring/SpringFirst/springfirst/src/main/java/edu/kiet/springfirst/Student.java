package edu.kiet.springfirst;

public class Student {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	int roll;
	int marks;
	Student()
	{}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+name+", Roll Number="+roll+", Marks="+marks;
	}
	

}
