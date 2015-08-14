package com.daju.lostfound.lf_persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person extends BaseEntity{
	
	@Column (name="name")
	private String name;
	
	@Column (name="surname")
	private String surname; 
	
	@Column (name="dni")
	private int dni;
	
	public Person(){}

	public Person(String name, String surname, int dni) {
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
}
