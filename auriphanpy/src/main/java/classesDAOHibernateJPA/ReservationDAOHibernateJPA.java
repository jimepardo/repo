package classesDAOHibernateJPA;

import classesDAO.ReservationDAO;
import models.Reservation;

public class ReservationDAOHibernateJPA extends GenericDAOHibernateJPA<Reservation> implements ReservationDAO{
	
	public ReservationDAOHibernateJPA() {
		super(Reservation.class);
	}

}