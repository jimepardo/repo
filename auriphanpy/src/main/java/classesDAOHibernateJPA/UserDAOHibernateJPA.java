package classesDAOHibernateJPA;

import classesDAO.UserDAO;
import models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class UserDAOHibernateJPA extends GenericDAOHibernateJPA<User> implements UserDAO{
	
	public UserDAOHibernateJPA() {
		super(User.class);
	}

	public User getPerson(String email) {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT u "
				+ " FROM User as u"
				+ " WHERE u.email = :email ";

		Query consult = EMFactory.getEMF().createEntityManager().createQuery(sql);
		consult.setParameter("email", email);
		User result = (User) consult.getSingleResult();
		return result;
	}

	
}
