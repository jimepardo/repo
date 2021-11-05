package classesDAOHibernateJPA;

import classesDAO.EventDAO;
import models.Event;

public class EventDAOHibernateJPA extends GenericDAOHibernateJPA<Event> implements EventDAO{
	
	public EventDAOHibernateJPA() {
		super(Event.class);
	}
}