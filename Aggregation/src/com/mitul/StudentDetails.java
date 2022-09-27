package com.mitul;

public class StudentDetails {
	
	 static void display(Student s)
	 {
		 System.out.println("Name"+s.getName());
		 System.out.println("id"+s.getId());
		 System.out.println("address"+s.getAddr());
		 
	 }

	public static void main(String[] args) {

		Student s1=new Student("Mitul",15,new Address("c-7 rom36","mumbai",400067,"Maharashtra"));
		System.out.println("Detail are :");
		display(s1);

	}

}
