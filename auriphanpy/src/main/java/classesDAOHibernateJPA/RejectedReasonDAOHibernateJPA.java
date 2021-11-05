package classesDAOHibernateJPA;

import classesDAO.RejectedReasonDAO;
import models.RejectedReason;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class RejectedReasonDAOHibernateJPA extends GenericDAOHibernateJPA<RejectedReason> implements RejectedReasonDAO{

	public RejectedReasonDAOHibernateJPA() {
		super(RejectedReason.class);
	}

	@Override
	public List<RejectedReason> getAll() {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT rr "
				+ " FROM RejectedReason rr";

		Query consulta = em.createQuery(sql);
		List<RejectedReason> resultado = consulta.getResultList();
		return resultado;
	}

	@Override
	public RejectedReason findByName(String nombre) {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT rr "
				+ " FROM RejectedReason rr"
				+ " WHERE rr.name = :nombre ";

		Query consulta = em.createQuery(sql);
		consulta.setParameter("nombre", nombre);
		RejectedReason resultado = (RejectedReason) consulta.getSingleResult();
		return resultado;
	}
}