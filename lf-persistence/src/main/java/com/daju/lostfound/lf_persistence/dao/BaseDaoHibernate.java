package com.daju.lostfound.lf_persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import com.daju.lostfound.lf_persistence.entity.BaseEntity;

@Repository
public class BaseDaoHibernate<B extends BaseEntity> implements BaseDao<B>{

	private Class<B> persistentClass;
	
	private EntityManager entityManager;
	
	public BaseDaoHibernate(Class<B> persistentClass){
		this.persistentClass = persistentClass;
	}

	public List<B> getByExample(B example) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public B getNewInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<B> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public B save(B object) {	
		return entityManager.merge(object);
	}

	public void delete(B object) {
		entityManager.remove(object);
	}

	public B getById(Long id) {
		return entityManager.find(persistentClass, id);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Required
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
