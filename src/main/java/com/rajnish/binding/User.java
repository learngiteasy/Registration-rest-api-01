package com.rajnish.binding;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class User {
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	private String emailId;
	private Integer phoneNo;
	private LocalDate dob;
	private String gender;
	private String accStatus;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String pass;
	

	private LocalDate createdDate;
	private LocalDate updatedDate;
	
}
