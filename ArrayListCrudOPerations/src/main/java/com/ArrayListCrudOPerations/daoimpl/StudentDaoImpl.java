package com.ArrayListCrudOPerations.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOPerations.dao.StudentDao;
import com.ArrayListCrudOPerations.model.Student;

public class StudentDaoImpl implements StudentDao {

	List<Student> sList = new ArrayList<Student>();

	// creating Scanner object
	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		// craeting student object
		Student ss = new Student();
		// input the details of student
		System.out.println("Enter the id :");
		ss.setId(sc.nextInt());
		System.out.println("Enter the name :");
		ss.setName(sc.next());
		System.out.println("Enter the marks :");
		ss.setMarks(sc.nextFloat());

		sList.add(ss);
		System.out.println(sList);

	}

	@Override
	public boolean deleteStudent(int id) {

		// TODO Auto-generated method stub
		boolean status = false;
		// reference of student
		Student sdel = null;

		// finding a record
		for (Student s : sList) {
			if (s.getId() == id)
				sdel = s;
		}
		// check whether the record is present or not
		if (sdel == null)
			status = false;
		else {
			sList.remove(sdel);
			status = true;
		}

		return status;
	}

	@Override
	public boolean updateStudent(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Student sfind = null;
		// finding the student
		for (Student s : sList) {
			if (s.getId() == id)
				sfind = s;
		}
		if (sfind != null) {
			int ch = 0;
			System.out.println("1. Update name");
			System.out.println("2. Update Marks");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the name :");
				sfind.setName(sc.next());
				System.out.println("Name updated........");
				status = true;
				break;

			case 2:
				System.out.println("Enter the marks :");
				sfind.setMarks(sc.nextFloat());
				System.out.println("Marks updated........");
				status = true;
				break;

			default:
				System.out.println("No such property.....");
			}

		} else
			status = false;
		return status;
	}

	@Override
	public Student findStudent(int id) {
		boolean status = false;
		// reference of student
		Student sfind = null;

		// finding a record
		for (Student s : sList) {
			if (s.getId() == id)
				sfind = s;
		}

		return sfind;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub

		for (Student s : sList) {
			System.out.println(s);
		}

	}

}
