package com.Employee.Dao;

import com.Employee.model3.Employe;

public interface EmployeDao {

	boolean updateEmployeDetails(int emp_id);

	void addEmployeDetails();

	boolean deleteEmployeDetails(int emp_id);

	Employe findEmployeData(int emp_id);

	void displayAll();

}
