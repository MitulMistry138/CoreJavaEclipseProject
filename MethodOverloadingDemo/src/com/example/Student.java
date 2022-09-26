package com.example;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private double marks;
	private String course;
	
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, double marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.course = course;
	}

	
	public Student(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

}
