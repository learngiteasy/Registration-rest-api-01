package com.rajnish.restcontrollers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.rajnish.binding.User;
import com.rajnish.services.UserRegistration;

@RestController
public class RegistrationController {

	@Autowired
	private UserRegistration userRegistration;
	
	@GetMapping("/registrationform")
	public Map<Integer,String> getCountries(){
		Map<Integer, String> countries = this.userRegistration.getCountries();
		return countries;	
	}
	@GetMapping("/getstates/{countryId}")
	public Map<Integer,String> getStates(@PathVariable Integer countryId ){
	   System.out.println(countryId);
		Map<Integer, String> states = this.userRegistration.getStateById(countryId);
		return states;
		
	}
	@GetMapping("/getcities/{stateId}")
	public Map<Integer,String> getCities(@PathVariable Integer stateId ){
		Map<Integer, String> cities = this.userRegistration.getCityById(stateId);
		return cities;
		
	}
	
	@PostMapping("/registeruser")
     public String registerUser(@RequestBody User user) {
		
		return this.userRegistration.saveUser(user);
		
	}
}
