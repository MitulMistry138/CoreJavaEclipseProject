package com.ArrayListCrudOPerations.dao;

import com.ArrayListCrudOPerations.model.Student;

public interface StudentDao {

	void addStudent();

	boolean deleteStudent(int id);

	Student findStudent(int id);

	boolean updateStudent(int id);

	void displayAll();
}
