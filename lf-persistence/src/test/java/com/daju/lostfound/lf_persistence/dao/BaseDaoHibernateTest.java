package com.daju.lostfound.lf_persistence.dao;

import org.junit.Before;
import org.junit.Test;

import com.daju.lostfound.lf_persistence.entity.Person;

import junit.framework.Assert;

public class BaseDaoHibernateTest {
	
	private BaseDaoHibernate<Person> baseDaoHibernate;
	
	@Before
	public void setUp() {
		baseDaoHibernate = new BaseDaoHibernate<Person>(Person.class);
	}
	
	@Test
	public void shouldInserGetAndDeleteFromDBTest() {
		Person person = new Person("Juan", "Bais", 33067158);
		baseDaoHibernate.save(person);
		
		Person newPerson = baseDaoHibernate.getById(person.getId());
		
		Assert.assertEquals(person.getDni(), newPerson.getDni());
		
		baseDaoHibernate.delete(person);
	}
}
