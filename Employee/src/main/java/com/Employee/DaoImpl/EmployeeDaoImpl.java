
package com.Employee.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Employee.Dao.EmployeDao;
import com.Employee.model3.Employe;

public class EmployeeDaoImpl implements EmployeDao {

	List<Employe> eList = new ArrayList<Employe>();

	// creating Scanner object
	Scanner sc = new Scanner(System.in);

	@Override
	public void addEmployeDetails() {
		// TODO Auto-generated method stub
		// craeting employe object
		Employe emp = new Employe();

		// input the details of employe

		System.out.println("Employe id :");
		emp.setEmp_id(sc.nextInt());
		System.out.println("Employe  name :");
		emp.setEmp_name(sc.next());
		System.out.println("Employe  Salary :");
		emp.setEmp_salary(sc.nextDouble());

		eList.add(emp);
		System.out.println();
		System.out.println(eList);
		System.out.println();

	}

	@Override
	public boolean deleteEmployeDetails(int id) {

		// TODO Auto-generated method stub
		boolean status = false;
		// reference of student
		Employe empDelete = null;

		// finding a record
		for (Employe e : eList) {
			if (e.getEmp_id() == id)
				empDelete = e;
		}
		// check whether the record is present or not
		if (empDelete == null)
			status = false;
		else {
			eList.remove(empDelete);
			status = true;
		}

		return status;
	}

	@Override
	public boolean updateEmployeDetails(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employe empfindData = null;
		// finding the student
		for (Employe e : eList) {
			if (e.getEmp_id() == id)
				empfindData = e;
		}
		if (empfindData != null) {
			int ch = 0;
			System.out.println("1. Update name");
			System.out.println("2. Update Salary Status");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the name :");
				empfindData.setEmp_name(sc.next());
				System.out.println("Name updated........");
				status = true;
				break;

			case 2:
				System.out.println("Enter the salary :");
				empfindData.setEmp_salary(sc.nextDouble());
				System.out.println("Salary updated........");
				status = true;
				break;

			default:
				System.out.println("No such property.....");
			}

		} else
			status = false;
		return status;
	}

	public Employe findEmployeData(int id) {
		boolean status = false;
		// reference of student
		Employe empfindData = null;

		// finding a record
		for (Employe e : eList) {
			if (e.getEmp_id() == id)
				empfindData = e;
		}

		return empfindData;
	}

	public void displayAll() {
		// TODO Auto-generated method stub

		for (Employe e : eList) {
			System.out.println(e);
		}

	}

}
