package classesDAOHibernateJPA;

import classesDAO.ImageDAO;
import models.Image;

public class ImageDAOHibernateJPA  extends GenericDAOHibernateJPA<Image> implements ImageDAO{

	public ImageDAOHibernateJPA() {
		super(Image.class);
	}
}
