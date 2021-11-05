package classesDAOHibernateJPA;

import classesDAO.PaymentMethodDAO;
import models.PaymentMethod;
import models.RejectedReason;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class PaymentMethodDAOHIbernateJPA extends GenericDAOHibernateJPA<PaymentMethod> implements PaymentMethodDAO{
	
	public PaymentMethodDAOHIbernateJPA() {
		super(PaymentMethod.class);
	}

	@Override
	public List<PaymentMethod> getAll() {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT pm "
				+ " FROM PaymentMethod pm";

		Query consulta = em.createQuery(sql);
		List<PaymentMethod> resultado = consulta.getResultList();
		return resultado;
	}

	@Override
	public PaymentMethod findByName(String nombre) {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT pm "
				+ " FROM PaymentMethod pm"
				+ " WHERE pm.name = :nombre ";

		Query consulta = em.createQuery(sql);
		consulta.setParameter("nombre", nombre);
		PaymentMethod resultado = (PaymentMethod) consulta.getSingleResult();
		return resultado;
	}


}