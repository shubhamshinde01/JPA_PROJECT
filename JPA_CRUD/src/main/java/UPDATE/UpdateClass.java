package UPDATE;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ENTITYFACTORY.entityClass;
import StudClass.students;

public class UpdateClass {
	
	public static void UpdateMethod(int n) {
		EntityManager em = null;
		em = entityClass.getConnect("shubhz");
		EntityTransaction et = em.getTransaction();
		et.begin();
		students stud=em.find(students.class,n);
		stud.setMark(200);
		em.persist(stud);
		et.commit();
		
	}

}
