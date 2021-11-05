package classesDAOHibernateJPA;

import classesDAO.ServiceDAO;
import models.Service;

public class ServiceDAOHibernateJPA extends GenericDAOHibernateJPA<Service> implements ServiceDAO{

	public ServiceDAOHibernateJPA() {
		super(Service.class);
	}
}
