package com.beans;

public class Student {

	private String name;
	private int rollno;
	private Address address;
	
	
	public void setName(String name) {
		System.out.println("Setter Method Name");
		this.name = name;
	}


	public void setRollno(int rollno) {
		System.out.println("Setter Method rollno");
		this.rollno = rollno;
	}


	public void setAddress(Address address) {
		System.out.println("Setter Method address");
		this.address = address;
	}


	public void display() {
		System.out.println("name :"+ name);
		System.out.println("rollno :"+ rollno);
		System.out.println("address :"+ address);
	}
	
}
