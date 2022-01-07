package com.rajnish.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CountryEntity {

	public CountryEntity(Integer countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	
	public CountryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private Integer countryId;
	private String countryName;
}
