package com.example;

import java.util.Scanner;

public class StudentTest {
	
	static void displayStudent(Student[] s1) {
		for(Student obj:s1)
		{
			System.out.println("Name "+obj.getName()+" Score "+obj.getMarks()+"course:"+obj.getCourse());
		}	
	}
	
	//method overloading
	static void displayStudent(Student[] s1, double marks)
	{
		for(Student obj:s1) {
			if(obj.getMarks()>=90.0)
			{
				System.out.println("Name "+obj.getName()+" Score "+obj.getMarks()+"course:"+obj.getCourse());
			}
		}
			
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Student s[] = new Student[5];
		s[0] =new Student(1,"mitul",25,90.3);
		s[1] =new Student(2,"l",28,90.3);
		s[2] =new Student(3,"mi",21,89.2);
		s[3] =new Student(4,"ml",26,69.9);
		s[4] =new Student(5,"ul",24,30.3);
		int ch;
		
		System.out.println("Enter 1 to get all details: ");
		System.out.println("Enter 2 to get 90 above details: ");
		System.out.println("Enter your choice ");
		
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:displayStudent(s);
				break;
		case 2:displayStudent(s, 90.0);
				break;
		default:System.out.println("Wrong input-");
		
		}

	}

}
