package com.rajnish.services;

import java.util.Map;

import com.rajnish.binding.User;

public interface UserRegistration {

	public String saveUser(User user);
	
	public Map<Integer,String> getCountries();
	
	public Map<Integer,String> getStateById(Integer id);
	
	public Map<Integer,String> getCityById(Integer id);
}
