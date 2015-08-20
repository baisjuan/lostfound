package com.daju.lostfound.lf_persistence.dao;

import java.util.List;

import com.daju.lostfound.lf_persistence.entity.BaseEntity;

public interface BaseDao<B extends BaseEntity> {
	B getById(Long id);
	B getNewInstance();
	List<B> getAll();
	int getCount();
	B save(B object);	
	void delete(B object);
	List<B> getByExample(B example);
}
