package mainTests;

import classesDAOHibernateJPA.*;
import models.*;

public class mainTestingUpdate {

    public static void main(String[] args) {
        /* Se prueba update en bd */

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
        EventType eventType1 = eventtypeDAO.get((long)1);

        eventType1.setName("Cena");

        eventtypeDAO.update(eventType1);

        /* RejectedReason  */
        RejectedReason rej1 = rejectedrDAO.get((long)2);
        rej1.setName("Mal servicio");

        rejectedrDAO.update(rej1);

        /* PaymentMethod */
        PaymentMethod pay1 = paymentmDAO.get((long)1);
        pay1.setName("Tarjeta de debito");

        paymentmDAO.update(pay1);

        /* ServiceType */
        ServiceType ser1 = servicetypeDAO.get((long)1);
        ser1.setName("Show de luces");

        servicetypeDAO.update(ser1);

        /* User */
        User user1 = userDAO.get((long)1);
        user1.setFirstName("Juliana");

        userDAO.update(user1);

        /* Service */
        Service service1 = serviceDAO.get((long)1);
        service1.setDescription("Nueva descripcion");

        serviceDAO.update(service1);

        /* Image */
        Image i1= imageDAO.get((long)1);
        i1.setPath("/resources/i2.jpg");

        imageDAO.update(i1);

        /* ScoreCriterion */
        ScoreCriterion scorec1 = scorecriterionDAO.get((long)3);
        scorec1.setName("Precio");

        scorecriterionDAO.update(scorec1);

        /* Event */
        Event event1 = eventDAO.get((long)1);
        event1.setName("Show de luces");

        eventDAO.update(event1);

        /* Score */
        Score score1 = scoreDAO.get((long)1);
        score1.setScore(3);

        scoreDAO.update(score1);


        /* Reservation */
        Reservation res1 = reservationDAO.get((long)1);
        res1.setWasAccepted(1);

        reservationDAO.update(res1);

    }
}
