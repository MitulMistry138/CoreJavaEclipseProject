package com.Employee.model3;

public class Employe {

	private int emp_id;
	private String emp_name;
	private double emp_salary;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int emp_id, String emp_name, double emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employe ID=" + emp_id + ", Employe Name=" + emp_name + ", Employe Salary=" + emp_salary + "";
	}

}
