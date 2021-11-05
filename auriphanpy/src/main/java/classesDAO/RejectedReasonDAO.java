package classesDAO;

import models.RejectedReason;

import java.util.List;

public interface RejectedReasonDAO extends GenericDAO<RejectedReason>{

    public List<RejectedReason> getAll();
    public RejectedReason findByName(String nombre);
}
