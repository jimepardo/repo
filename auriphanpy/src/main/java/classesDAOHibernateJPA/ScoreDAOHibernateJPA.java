package classesDAOHibernateJPA;

import classesDAO.ScoreDAO;
import models.Score;

public class ScoreDAOHibernateJPA extends GenericDAOHibernateJPA<Score> implements ScoreDAO {
	
	public ScoreDAOHibernateJPA() {
		super(Score.class);
	}

}