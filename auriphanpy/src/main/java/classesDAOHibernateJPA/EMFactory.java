package classesDAOHibernateJPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {
	private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("auriphanpy");

	public static EntityManagerFactory getEMF() {
		return em;
	}
}
