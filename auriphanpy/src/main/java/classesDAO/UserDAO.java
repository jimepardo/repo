package classesDAO;

import models.User;

public interface UserDAO extends GenericDAO<User>{
	
	public User getPerson(String user);

}
