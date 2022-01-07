package com.rajnish.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CityEntity {

	@Id
	private Integer cityId;
	private String cityName;
	
	private Integer stateId;

	public CityEntity(Integer cityId, String cityName, Integer stateId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateId = stateId;
	}

	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
