package classesDAO;

import classesDAOHibernateJPA.*;
import models.ServiceType;
import models.User;

public class DAOFactory {

    public static UserDAO getUserDAO(String type){
        UserDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new UserDAOHibernateJPA();
                break;
            default:
                retornar = new UserDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static UserDAO getUserDAO(){
        return new UserDAOHibernateJPA();
    }

    public static ReservationDAO getReservationDAO(String type){
        ReservationDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ReservationDAOHibernateJPA();
                break;
            default:
                retornar = new ReservationDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ReservationDAO getReservationDAO(){
        return new ReservationDAOHibernateJPA();
    }

    public static EventDAO getEventDAO(String type){
        EventDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new EventDAOHibernateJPA();
                break;
            default:
                retornar = new EventDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static EventDAO getEventDAO(){
        return new EventDAOHibernateJPA();
    }

    public static EventTypeDAO getEventTypeDAO(String type){
        EventTypeDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new EventTypeDAOHibernateJPA();
                break;
            default:
                retornar = new EventTypeDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static EventTypeDAO getEventTypeDAO(){
        return new EventTypeDAOHibernateJPA();
    }

    public static ImageDAO getImageDAO(String type){
        ImageDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ImageDAOHibernateJPA();
                break;
            default:
                retornar = new ImageDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ImageDAO getImageDAO(){
        return new ImageDAOHibernateJPA();
    }

    public static PaymentMethodDAO getPaymentMethodDAO(String type){
        PaymentMethodDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new PaymentMethodDAOHIbernateJPA();
                break;
            default:
                retornar = new PaymentMethodDAOHIbernateJPA();
                break;
        }
        return retornar;
    }

    public static PaymentMethodDAO getPaymentMethodDAO(){
        return new PaymentMethodDAOHIbernateJPA();
    }

    public static RejectedReasonDAO getRejectedReasonDAO(String type){
        RejectedReasonDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new RejectedReasonDAOHibernateJPA();
                break;
            default:
                retornar = new RejectedReasonDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static RejectedReasonDAO getRejectedReasonDAO(){
        return new RejectedReasonDAOHibernateJPA();
    }

    public static ScoreDAO getScoreDAO(String type){
        ScoreDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ScoreDAOHibernateJPA();
                break;
            default:
                retornar = new ScoreDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ScoreDAO getScoreDAO(){
        return new ScoreDAOHibernateJPA();
    }

    public static ScoreCriterionDAO getScoreCriterionDAO(String type){
        ScoreCriterionDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ScoreCriterionDAOHibernateJPA();
                break;
            default:
                retornar = new ScoreCriterionDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ScoreCriterionDAO getScoreCriterionDAO(){
        return new ScoreCriterionDAOHibernateJPA();
    }

    public static ServiceDAO getServiceDAO(String type){
        ServiceDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ServiceDAOHibernateJPA();
                break;
            default:
                retornar = new ServiceDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ServiceDAO getServiceDAO(){
        return new ServiceDAOHibernateJPA();
    }

    public static ServiceTypeDAO getServiceTypeDAO(String type){
        ServiceTypeDAO retornar;
        switch(type){
            case "HibernateJPA":
                retornar = new ServiceTypeDAOHibernateJPA();
                break;
            default:
                retornar = new ServiceTypeDAOHibernateJPA();
                break;
        }
        return retornar;
    }

    public static ServiceTypeDAO getServiceTypeDAO(){
        return new ServiceTypeDAOHibernateJPA();
    }

	
}
