package com.javawebtutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ManytoOneService {

	@PersistenceContext
	private static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();

		em.getTransaction().begin();
		Department resultDepartment = new Department(100, "IT");
		em.persist(resultDepartment);

		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Juee");
		employee.setSalary(25000);
		employee.setJob_id(1);
		employee.setDepartment(resultDepartment);
		em.persist(employee);

		Employee employeeOne = new Employee();
		employeeOne.setEid(2);
		employeeOne.setEname("Jyoti");
		employeeOne.setSalary(50000);
		employeeOne.setJob_id(2);
		employeeOne.setDepartment(resultDepartment);
		em.persist(employeeOne);

		Employee employeeTwo = new Employee();
		employeeTwo.setEid(3);
		employeeTwo.setEname("Pravin");
		employeeTwo.setSalary(100000);
		employeeTwo.setJob_id(3);
		employeeTwo.setDepartment(resultDepartment);
		em.persist(employeeTwo);

		resultDepartment.getEmployees().add(employee);
		resultDepartment.getEmployees().add(employeeOne);
		resultDepartment.getEmployees().add(employeeTwo);

		em.getTransaction().commit();
		em.getTransaction().begin();
		Employee employeeResult = em.find(Employee.class, 1);
		System.out.println("Employee " + employeeResult);
		System.out.println("Employee Dept "
				+ employeeResult.getDepartment().getDname());
		em.getTransaction().commit();

		em.getTransaction().begin();
		Department department = em.find(Department.class, 100);
		System.out.println("department " + department);
		System.out.println("Employees " + department.getEmployees());
		em.getTransaction().commit();

		deleteEmployees();
		deleteDepartment();
		em.close();
		emf.close();

	}

	private static void deleteEmployees() {
		em.getTransaction().begin();
		int deletedCount = em.createQuery("DELETE FROM Employee")
				.executeUpdate();
		System.out.println("Delete Employee " + deletedCount);
		em.getTransaction().commit();

	}

	private static void deleteDepartment() {
		em.getTransaction().begin();
		int deletedCount = em.createQuery("DELETE FROM Department")
				.executeUpdate();
		System.out.println("Delete Department " + deletedCount);
		em.getTransaction().commit();

	}

	/*
	 * private static void createDepartment(int id, String dept) {
	 * em.getTransaction().begin(); Department department = new Department(id,
	 * dept); em.persist(department); em.getTransaction().commit(); }
	 */
}
