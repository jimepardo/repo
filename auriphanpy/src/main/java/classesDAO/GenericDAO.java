package classesDAO;

import java.io.Serializable;

public interface GenericDAO<T> {

public T update(T entity);
	
	public T delete(Serializable id);
	
	public boolean exists(Serializable id);
	
	public T save(T entity);
	
	public T get(Serializable id);
	
}
