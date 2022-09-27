package com.mitul;

public class Student {
	
	private String name;
	private int id;
	private  Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, Address addr) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}
		
}
