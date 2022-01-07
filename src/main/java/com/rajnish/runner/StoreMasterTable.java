package com.rajnish.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rajnish.entity.CityEntity;
import com.rajnish.entity.CountryEntity;
import com.rajnish.entity.StateEntity;
import com.rajnish.repository.CityRepository;
import com.rajnish.repository.CountryRepository;
import com.rajnish.repository.StateRepository;

@Component
public class StoreMasterTable implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepo;
	
	@Autowired
	private StateRepository stateRepo;
	
	@Autowired
	private CityRepository cityRepo;

	@Override
	public void run(String... args) throws Exception {
		
	   CountryEntity country1=new CountryEntity(1,"India");
	   CountryEntity country2=new CountryEntity(2,"America");
	   
	   StateEntity state1=new StateEntity(101,"Utter Pradesh",1);
	   StateEntity state2=new StateEntity(102,"West Bengal",1);
	   
	   
	   CityEntity city1=new CityEntity(1001,"Varanasi",101);
	   CityEntity city2=new CityEntity(1002,"Kanpur",101);
	   CityEntity city3=new CityEntity(1003,"Kolkata",102);
	   CityEntity city4=new CityEntity(1004,"Asansol",102);
	   
	   
	   StateEntity state3=new StateEntity(103,"Alaska",2);
	   StateEntity state4=new StateEntity(104,"Florida",2);
	   
	   
	   CityEntity city5=new CityEntity(1005,"Lakes",103);
	   CityEntity city6=new CityEntity(1006,"Kodiak",103);
	   CityEntity city7=new CityEntity(1007,"Miami",104);
	   CityEntity city8=new CityEntity(1008,"Midway",104);
	   
	   this.countryRepo.save(country1);
	   this.stateRepo.save(state1);
	   this.stateRepo.save(state2);
	   this.cityRepo.save(city1);
	   this.cityRepo.save(city2);
	   this.cityRepo.save(city3);
	   this.cityRepo.save(city4);
	   
	   this.countryRepo.save(country2);
	   this.stateRepo.save(state3);
	   this.stateRepo.save(state4);
	   this.cityRepo.save(city5);
	   this.cityRepo.save(city6);
	   this.cityRepo.save(city7);
	   this.cityRepo.save(city8);
	   
	   
	}

	

}
