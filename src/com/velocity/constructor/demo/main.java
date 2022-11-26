package com.velocity.constructor.demo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student stu1 = new Student(1,"om");
        Student stu2 = new Student(2);
        Student stu3 = new Student();
        
        System.out.println(stu1);

	}

}
