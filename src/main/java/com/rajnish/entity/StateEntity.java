package com.rajnish.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StateEntity {

	@Id
	private Integer stateId;
	private String stateName;
	
	private Integer countryId;

	public StateEntity(Integer stateId, String stateName, Integer countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}

	public StateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
