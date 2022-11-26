package com.velocity.constructor.demo;

public class Student {
	int id;
	String name;
	
    
	public Student(int id ,String n) {
		this.id=id;
		this.name=n;
	}
	public Student(int id) {
		this.id=id;
		this.name= "bobby";
	}
	public Student () {
		this.id=10;
		this.name="vishal";
	}
	
	public void print() {
		
	}
}
