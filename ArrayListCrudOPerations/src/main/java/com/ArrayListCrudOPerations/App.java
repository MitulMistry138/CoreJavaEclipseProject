package com.ArrayListCrudOPerations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOPerations.dao.StudentDao;
import com.ArrayListCrudOPerations.daoimpl.StudentDaoImpl;
import com.ArrayListCrudOPerations.model.Student;

/**
 * Hello world!
 *
 */
public class App {

	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Search Student");
		System.out.println("5. Display all Student");
		System.out.println("6. Exit");

	}

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		// creating object of impl
		StudentDao school = new StudentDaoImpl();

		// list of students
		List<Student> sList = new ArrayList<Student>();

		int ch;
		do {
			menu();
			// input for ch
			ch = sc1.nextInt();
			// creating switch case
			switch (ch) {
			case 1:
				school.addStudent();
				System.out.println("Student inserted.....");
				break;
			case 2:
				System.out.println("Enter the id to be deleted");
				int id = sc1.nextInt();
				boolean flag = school.deleteStudent(id);
				if (flag)
					System.out.println("Student id deleted...");
				else
					System.out.println("Student id not found...");
				break;
			case 3:
				System.out.println("Enter the Id to be updated:");
				id = sc1.nextInt();
				flag = school.updateStudent(id);
				if (flag)
					System.out.println("Student updated......");
				else
					System.out.println("Student not found......");
				break;

			case 4:
				Student ss = null;
				System.out.println("Enter the Id to be searched:");
				id = sc1.nextInt();
				ss = school.findStudent(id);
				if (ss == null)
					System.out.println("Student not found.......");
				else
					System.out.println(
							"Student Id :" + ss.getId() + "  Name:" + ss.getName() + "   Marks:" + ss.getMarks());
				break;

			case 5:
				school.displayAll();
				break;

			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("String not found..");
			}

		} while (ch != '6');

	}
}
