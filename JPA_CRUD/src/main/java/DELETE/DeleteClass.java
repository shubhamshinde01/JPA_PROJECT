package DELETE;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ENTITYFACTORY.entityClass;
import StudClass.students;

public class DeleteClass {
	public static void DeletMethod(int n) {
		EntityManager em = null;
		em = entityClass.getConnect("shubhz");
		EntityTransaction et = em.getTransaction();
		et.begin();
		students stud=em.find(students.class,n);
		em.remove(stud);
		et.commit();
	}
}
