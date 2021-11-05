package mainTests;

import classesDAOHibernateJPA.*;
import models.*;

public class mainTestingDelete {
    public static void main(String[] args) {
        /* Se prueba delete en bd */

        /* Declaramos objetos DAOHJ para borrar los datos */

//        EventDAOHibernateJPA eventDAO = new EventDAOHibernateJPA();
//        EventTypeDAOHibernateJPA eventtypeDAO = new EventTypeDAOHibernateJPA();
//        ImageDAOHibernateJPA imageDAO= new ImageDAOHibernateJPA();
//        PaymentMethodDAOHIbernateJPA paymentmDAO = new PaymentMethodDAOHIbernateJPA();
//        RejectedReasonDAOHibernateJPA rejectedrDAO = new RejectedReasonDAOHibernateJPA();
//        ReservationDAOHibernateJPA reservationDAO = new ReservationDAOHibernateJPA();
//        ScoreDAOHibernateJPA scoreDAO = new ScoreDAOHibernateJPA();
//        ScoreCriterionDAOHibernateJPA scorecriterionDAO = new ScoreCriterionDAOHibernateJPA();
//        ServiceDAOHibernateJPA serviceDAO = new ServiceDAOHibernateJPA();
//        ServiceTypeDAOHibernateJPA servicetypeDAO = new ServiceTypeDAOHibernateJPA();

        UserDAOHibernateJPA userDAO = new UserDAOHibernateJPA();

        /* User */
        userDAO.delete((long)1);

        /* Al borrar un usuario, se elimina en cascada las siguientes clases tambien
        *  Services, Score, Reservation, Image, Event
        */

//        /* EventType */
//        eventtypeDAO.delete((long)1);
//
//        /* RejectedReason  */
//        rejectedrDAO.delete((long)2);
//
//        /* PaymentMethod */
//        paymentmDAO.delete((long)1);
//
//        /* ServiceType */
//        servicetypeDAO.delete((long)1);

//        /* Service */
//        serviceDAO.delete((long)1);
//
//        /* Image */
//        imageDAO.delete((long)2);
//
//        /* ScoreCriterion */
//        scorecriterionDAO.delete((long)1);
//
//        /* Event */
//        eventDAO.delete((long)1);
//
//        /* Score */
//        scoreDAO.delete((long)1);
//
//        /* Reservation */
//        reservationDAO.delete((long)1);

    }
}
