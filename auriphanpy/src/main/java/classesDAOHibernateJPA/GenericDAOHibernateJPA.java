package classesDAOHibernateJPA;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import classesDAO.GenericDAO;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

protected Class<T> persistentClass;
	
	public GenericDAOHibernateJPA(Class<T> genericClass) {
		persistentClass= genericClass;
	}
	
	public Class<T> getPersistentClass(){
		return persistentClass;
	}
	
	public T save(T entity) {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		return entity;
	}
	
	public T get(Serializable id) {
		EntityManagerFactory emf= new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		T entity = em.find(persistentClass, id);
		em.getTransaction().commit();
		return entity;				
	}
	
	public boolean exists(Serializable id) {
		return !this.get(id).equals(null);
	}
	
	public T delete(Serializable id){
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		T entity = em.find(persistentClass,id);
		em.remove(entity);
		em.getTransaction().commit();
		return entity; 
	}
	
	public T update(T entity) {
		EntityManagerFactory emf = new EMFactory().getEMF();
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		return entity;
	}
}
