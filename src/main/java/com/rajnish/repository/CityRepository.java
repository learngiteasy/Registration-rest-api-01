package com.rajnish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajnish.entity.*;

public interface CityRepository extends JpaRepository<CityEntity,Integer> {

	

	public List<CityEntity> findByStateId(Integer id);

}
