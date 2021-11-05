package classesDAOHibernateJPA;

import classesDAO.ScoreCriterionDAO;
import models.ScoreCriterion;

public class ScoreCriterionDAOHibernateJPA extends GenericDAOHibernateJPA<ScoreCriterion> implements ScoreCriterionDAO{

	public ScoreCriterionDAOHibernateJPA() {
		super(ScoreCriterion.class);
	}
}
