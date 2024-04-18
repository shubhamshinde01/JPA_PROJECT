package ENTITYFACTORY;
import javax.persistence.*;

public class entityClass {
	
	public static EntityManager getConnect(String PersistanceUnit) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory(PersistanceUnit);
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
