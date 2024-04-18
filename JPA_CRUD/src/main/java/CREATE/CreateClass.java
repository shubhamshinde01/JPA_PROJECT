package CREATE;
import javax.persistence.*;
//import ENTITYFACTORY;
import StudClass.students;
import ENTITYFACTORY.entityClass;

public class CreateClass {
	public static void CreateMethod(students stud) {
		EntityManager em=null;
		em=entityClass.getConnect("shubhz");
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(stud);
		et.commit();
	}
}
