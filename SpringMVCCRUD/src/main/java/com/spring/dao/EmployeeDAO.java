package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.beans.Employee;

@Repository
public class EmployeeDAO {

	static List<Employee> employees = new ArrayList<>();
	static {
		employees
				.add(new Employee(100, "PRAVIN GHUMRE", 100000.00f, "Manager"));
		employees.add(new Employee(200, "JYOTI GHUMRE", 50000.00f, "Lead"));
		employees.add(new Employee(300, "PRANJAL GHUMRE", 20000.00f,
				"Associate"));
	}

	public void save(Employee emp) {
		employees.add(emp);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmpById(int id) {

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	public void update(Employee emp) {
		Employee employeeTemp = null;
		System.out.println("update starts !!!!!!!!");
		for (Employee employee : employees) {
			if (employee.getId() == emp.getId()) {
				employeeTemp = employee;
				break;
			}
		}
		employees.remove(employeeTemp);
		employees.add(emp);
		System.out.println("update ends !!!!!!!!");

	}

	public void delete(int id) {
		Employee employeeTemp = null;
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employeeTemp = employee;
				break;
			}
		}
		employees.remove(employeeTemp);
	}

}
