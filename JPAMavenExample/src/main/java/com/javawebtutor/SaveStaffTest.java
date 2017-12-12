package com.javawebtutor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class SaveStaffTest {

	@PersistenceContext
	private static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();

		em.getTransaction().begin();

		// Teaching staff entity
		TeachingStaff ts1 = new TeachingStaff(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd", "English");

		// Non-Teaching Staff entity
		NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
		NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");

		// storing all entities
		em.persist(ts1);
		em.persist(ts2);
		em.persist(nts1);
		em.persist(nts2);

		em.getTransaction().commit();

		deleteStaff();

		em.close();
		emf.close();
	}

	private static void deleteStaff() {
		em.getTransaction().begin();
		int deletedCount = em.createQuery("DELETE FROM Staff").executeUpdate();
		System.out.println("Delete Staff " + deletedCount);
		em.getTransaction().commit();

	}
}