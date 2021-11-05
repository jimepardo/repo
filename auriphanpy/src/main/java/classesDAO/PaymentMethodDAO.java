package classesDAO;

import models.PaymentMethod;

import java.util.List;

public interface PaymentMethodDAO extends GenericDAO<PaymentMethod>{

    public List<PaymentMethod> getAll();

    public PaymentMethod findByName(String nombre);
}
