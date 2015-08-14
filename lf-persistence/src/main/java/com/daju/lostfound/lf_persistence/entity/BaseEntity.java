package com.daju.lostfound.lf_persistence.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.daju.lostfound.lf_persistence.common.Identifiable;

@MappedSuperclass
public class BaseEntity implements Identifiable {

	private Long id;
		
	public void setId(Long id) {
		this.id = id;
	}
	
	@Id	@GeneratedValue
	public Long getId() {
		return this.id;
	}

}
