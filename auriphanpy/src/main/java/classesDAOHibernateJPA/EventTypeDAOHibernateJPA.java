package classesDAOHibernateJPA;

import classesDAO.EventTypeDAO;
import models.EventType;

public class EventTypeDAOHibernateJPA extends GenericDAOHibernateJPA<EventType> implements EventTypeDAO{
	
	public EventTypeDAOHibernateJPA() {
		super(EventType.class);
	}

}
