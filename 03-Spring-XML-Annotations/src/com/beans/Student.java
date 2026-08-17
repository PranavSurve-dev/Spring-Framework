package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Pranav")
	private String Name;
	@Value("143")
	private int RollNo;
	@Value("80.20")
	private float Marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("RollNo :"+RollNo);
		System.out.println("Marks :"+Marks);
	}
}
