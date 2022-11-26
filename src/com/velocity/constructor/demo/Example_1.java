package com.velocity.constructor.demo;

public class Example_1 {
	
	int no ;
	String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Example_1 obj = new Example_1(10 , "bobby");
		System.out.println(obj.name);
		
	}
	
	public Example_1(int no, String name ) {
		this.no = no;
		this.name = name ;
	}

}
