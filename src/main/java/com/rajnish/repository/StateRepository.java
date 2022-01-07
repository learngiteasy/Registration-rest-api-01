package com.rajnish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajnish.entity.StateEntity;

public interface StateRepository extends JpaRepository<StateEntity,Integer>  {

	public List<StateEntity> findByCountryId(Integer id);

}
