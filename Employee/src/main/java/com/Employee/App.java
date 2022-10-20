package com.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Employee.Dao.EmployeDao;
import com.Employee.DaoImpl.EmployeeDaoImpl;
import com.Employee.model3.Employe;

/**
 * Hello world!
 *
 */
public class App {

	public static void menu() {
		System.out.println("Employee Portal");
		System.out.println("1. Add Employe Details");
		System.out.println("2. Delete Employe Details");
		System.out.println("3. Update Employe Data");
		System.out.println("4. Search Employee Details");
		System.out.println("5. Display List of Employees in the company");
		System.out.println("6. Exit");

	}

	public static void main(String[] args) {
		Scanner emp1 = new Scanner(System.in);

		// creating object of impl
		EmployeDao company = new EmployeeDaoImpl();

		// list of students
		List<Employe> eList = new ArrayList<Employe>();

		int ch;
		do {
			menu();
			// input for ch
			ch = emp1.nextInt();
			// creating switch case
			switch (ch) {

			// for add records
			case 1:
				company.addEmployeDetails();
				System.out.println("Employe Data added successfully.");
				break;

			// to delete records
			case 2:
				System.out.println("Enter the id to be deleted");
				int emp_id = emp1.nextInt();
				boolean flag = company.deleteEmployeDetails(emp_id);
				if (flag)
					System.out.println("Employe id deleted.");
				else
					System.out.println("Employe id not found.");
				break;

			// to update the records
			case 3:
				System.out.println("Enter the Id to be updated:");
				emp_id = emp1.nextInt();

				flag = company.updateEmployeDetails(emp_id);
				if (flag)
					System.out.println("Employe updated.");
				else
					System.out.println("Employe not found.");
				break;

			// to search the records
			case 4:
				Employe emp = null;
				System.out.println("Enter the Id to be searched:");
				emp_id = emp1.nextInt();
				emp = company.findEmployeData(emp_id);
				if (emp == null)
					System.out.println("Employe not found.");
				else
					System.out.println("Employe id :" + emp.getEmp_id() + "  Name:" + emp.getEmp_name() + "   Marks:"
							+ emp.getEmp_salary());
				break;

			// to display all data

			case 5:
				company.displayAll();
				break;

			// exit from the portal
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Error 404 not found!!");
			}

		} while (ch != '6');

	}
}
