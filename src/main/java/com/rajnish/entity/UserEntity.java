package com.rajnish.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	@Column(unique=true)
	private String emailId;
	private Integer phoneNo;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	private String gender;
	private String accStatus;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	private String pass;
	
    @CreationTimestamp
	private LocalDate createdDate;
    
    @CreationTimestamp
	private LocalDate updatedDate;
	
	
}
