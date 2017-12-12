package com.javawebtutor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class JpaTest {

	@PersistenceContext
	private static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		createEmployee(1, "Pravin", "Ghumre", "Manager");
		createEmployee(2, "Jyoti", "Ghumre", "IT");
		createEmployee(3, "Pranjal", "Ghumre", "HR");
		updateEmployee(1);
		listOutEmployees();
		deleteEmployees();
		em.close();
		emf.close();
	}

	private static void deleteEmployees() {

		em.getTransaction().begin();
		int deletedCount = em.createQuery("DELETE FROM EmployeeTest")
				.executeUpdate();
		System.out.println("Delete EmployeeTest " + deletedCount);
		em.getTransaction().commit();

	}

	private static void updateEmployee(int i) {

		em.getTransaction().begin();
		EmployeeTest employee = em.find(EmployeeTest.class, 3);
		System.out.println("updated EmployeeTest " + employee.getFirstName());
		employee.setFirstName("Pranjal Update 11");
		em.merge(employee);
		em.flush();
		employee.setFirstName("Pranjal Updated 22");
		// refresh updated from database and overwrite the changes made
//		em.refresh(employee);
		em.getTransaction().commit();

	}

	private static void listOutEmployees() {
		em.getTransaction().begin();
		List<EmployeeTest> result = em.createQuery("from EmployeeTest",
				EmployeeTest.class).getResultList();
		for (EmployeeTest employee : result) {
			System.out.println("EmployeeTest (" + employee.getFirstName()
					+ ") : " + employee.getLastName());
		}
		em.getTransaction().commit();
	}

	private static void createEmployee(int id, String firstName,
			String lastName, String dept) {
		em.getTransaction().begin();
		EmployeeTest emp = new EmployeeTest(id, firstName, lastName, dept);
		em.persist(emp);
		em.getTransaction().commit();
	}
	
}
