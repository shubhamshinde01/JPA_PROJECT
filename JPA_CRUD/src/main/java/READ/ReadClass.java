package READ;
import javax.persistence.*;
import ENTITYFACTORY.entityClass;
import StudClass.students;


public class ReadClass {
	public static students ReadMethod(int n) {
			EntityManager em = null;
			em = entityClass.getConnect("shubhz");
			EntityTransaction et = em.getTransaction();
			et.begin();
			students stud=em.find(students.class,n);
			et.commit();
			return stud;
	}

}
