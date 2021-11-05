package mainTests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import classesDAOHibernateJPA.*;
import models.*;

public class mainTestingSave {

	public static void main(String[] args) {
		/* Se prueba create en bd */

		/* Declaramos objetos DAOHJ para persistir los datos */
		EventDAOHibernateJPA eventDAO = new EventDAOHibernateJPA();
		EventTypeDAOHibernateJPA eventtypeDAO = new EventTypeDAOHibernateJPA();
		ImageDAOHibernateJPA imageDAO= new ImageDAOHibernateJPA();
		PaymentMethodDAOHIbernateJPA paymentmDAO = new PaymentMethodDAOHIbernateJPA();
		RejectedReasonDAOHibernateJPA rejectedrDAO = new RejectedReasonDAOHibernateJPA();
		ReservationDAOHibernateJPA reservationDAO = new ReservationDAOHibernateJPA();
		ScoreDAOHibernateJPA scoreDAO = new ScoreDAOHibernateJPA();
		ScoreCriterionDAOHibernateJPA scorecriterionDAO = new ScoreCriterionDAOHibernateJPA();
		ServiceDAOHibernateJPA serviceDAO = new ServiceDAOHibernateJPA();
		ServiceTypeDAOHibernateJPA servicetypeDAO = new ServiceTypeDAOHibernateJPA();
		UserDAOHibernateJPA userDAO = new UserDAOHibernateJPA();


		/* EventType */
		EventType eventType1 = new EventType("Cumpleaños");
		EventType eventType2 = new EventType("Fiesta de disfraces");
		EventType eventType3 = new EventType("Cena");

		eventtypeDAO.save(eventType1);
		eventtypeDAO.save(eventType2);
		eventtypeDAO.save(eventType3);

		/* RejectedReason  */
		RejectedReason rej1 = new RejectedReason("No me gustó");
		RejectedReason rej2 = new RejectedReason("Impuntuales");

		rejectedrDAO.save(rej1);
		rejectedrDAO.save(rej2);

		/* PaymentMethod */
		PaymentMethod pay1 = new PaymentMethod("Efectivo");
		PaymentMethod pay2 = new PaymentMethod("Tarjeta de credito");

		paymentmDAO.save(pay1);
		paymentmDAO.save(pay2);

		/* ServiceType */
		ServiceType ser1 = new ServiceType("Wedding Planner");
		ServiceType ser2 = new ServiceType("Food Truck");
		ServiceType ser3 = new ServiceType("Catering");

		servicetypeDAO.save(ser1);
		servicetypeDAO.save(ser2);
		servicetypeDAO.save(ser3);

		/* User */
		User user1 = new User("Jimena", "Pardo", "jime@gmail.com", "123", "2214550481");
		User user2 = new User("Lautaro", "Mondati", "lau@gmail.com","123", "2216783443");

		userDAO.save(user1);
		userDAO.save(user2);

		/* Service */
		Service service1 = new Service("Wedding Planner Afrodita", "Planifico bodas", "www.wp-afrodita.com",
				"2213346654", "@afrodita-wp", "@afrodita-wp", user1, ser1);
		Service service2 = new Service("Catering Fullop", "Catering de comida", "www.caterign-fullop.com", "2213345767", "@cateringf", "@cateringf", user2, ser3);

		serviceDAO.save(service1);
		serviceDAO.save(service2);

		/* Image */
		Image i1= new Image("Imagen.jpg", "/resources/imagen.jpg", service1);
		Image i2= new Image("Imagen2.jpg", "/resources/imagen2.jpg", service2);

		imageDAO.save(i1);
		imageDAO.save(i2);

		/* ScoreCriterion */
		ScoreCriterion scorec1 = new ScoreCriterion("Limpieza");
		ScoreCriterion scorec2 = new ScoreCriterion("Simpatia");
		ScoreCriterion scorec3 = new ScoreCriterion("Calidad/Precio");
		ScoreCriterion scorec4 = new ScoreCriterion("Sabor");
		ScoreCriterion scorec5 = new ScoreCriterion("Disenio");

		scorecriterionDAO.save(scorec1);
		scorecriterionDAO.save(scorec2);
		scorecriterionDAO.save(scorec3);
		scorecriterionDAO.save(scorec4);
		scorecriterionDAO.save(scorec5);

		/* Event */
		Event event1 = new Event("Cumpleaños de 15 de Jocelyn", "44 e/ 30 y 31", "1900", "Buenos Aires", 25.551526, -58.3599999, "Planeada para divertirse", "Fiesta", eventType2, user1);
		Event event2 = new Event("Cena de egresados", "144 e/ 48 y 49", "1900", "Buenos Aires", 25.551526, -58.3599999, "Cena de egresados, colegio MP", "Fiesta", eventType3, user2);

		eventDAO.save(event1);
		eventDAO.save(event2);

		/* Score */
		Score score1 = new Score( 4, service1, scorec2);
		Score score2 = new Score( 5, service1, scorec3);
		Score score3 = new Score( 2, service2, scorec4);
		Score score4 = new Score( 1, service2, scorec5);

		scoreDAO.save(score1);
		scoreDAO.save(score2);
		scoreDAO.save(score3);
		scoreDAO.save(score4);

		/* Reservation */
		Reservation res1 = new Reservation(0, pay1, service1, user2, event1);
		Reservation res2 = new Reservation(0, pay2, service2, user1, event2);

		reservationDAO.save(res1);
		reservationDAO.save(res2);
	}

}
