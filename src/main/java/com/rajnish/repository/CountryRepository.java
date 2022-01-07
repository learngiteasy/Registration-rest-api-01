package com.rajnish.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rajnish.entity.*;
public interface CountryRepository extends JpaRepository<CountryEntity,Integer> {

}
