package classesDAOHibernateJPA;

import classesDAO.ServiceTypeDAO;
import models.ServiceType;

public class ServiceTypeDAOHibernateJPA extends GenericDAOHibernateJPA<ServiceType> implements ServiceTypeDAO{

	public ServiceTypeDAOHibernateJPA() {
		super(ServiceType.class);
	}
}
