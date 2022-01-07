//package com.rajnish.services;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import com.rajnish.binding.User;
//import com.rajnish.entity.CityEntity;
//import com.rajnish.entity.CountryEntity;
//import com.rajnish.entity.StateEntity;
//import com.rajnish.entity.UserEntity;
//import com.rajnish.repository.CityRepository;
//import com.rajnish.repository.CountryRepository;
//import com.rajnish.repository.StateRepository;
//import com.rajnish.repository.UserRepository;
//import com.rajnish.utils.EmailUtils;
//
//@Service
//public class Sample implements UserRegistration {
//
//	@Autowired
//	private UserRepository userRepo;
//
//
//	@Autowired
//	private CountryRepository countryRepo;
//	
//	@Autowired
//	private StateRepository stateRepo;
//	
//	@Autowired
//	private CityRepository cityRepo;
//
//	@Autowired
//	private JavaMailSender sender;
//	
//	@Autowired
//	private EmailUtils sendMail;
//	@Override
//	public String saveUser(User user) {
//		//
//		UserEntity userEntity=new UserEntity();
//		BeanUtils.copyProperties(user, userEntity);
//		if(!this.checkEmail(user.getEmailId())) {
//				
//	    userEntity.setPass(this.generatePass(user.getEmailId(),user.getFirstName(),user.getLastName()));
//	    userEntity.setAccStatus("LOCKED");
//		UserEntity save = this.userRepo.save(userEntity);
//		if(save !=null) {
//		boolean sendEmail = this.sendEmail(user.getEmailId(), "Unlock your account",userEntity.getPass());
//		if(sendEmail)
//			return "Registration Successfull! Check your emailid to unlock your account";
//		else
//			return "Email not recieved contact to our service team! Thank you.";
//		}
//		else
//			return "Some error occures";
//		}
//		else
//		{
//			
//			return "Emailid already registered!!";
//		}
//		
//		
//	}
//
//	
//
//	@Override
//	public Map<Integer, String> getCountries() {
//		
//		List<CountryEntity> findAll = this.countryRepo.findAll();
//		Map<Integer,String> countries=new HashMap();
//		
//		for(CountryEntity i:findAll) {
//			countries.put(i.getCountryId(), i.getCountryName());
//		}
//		return countries;
//	}
//
//	@Override
//	public Map<Integer, String> getStateById(Integer id) {
//		// 
//		List<StateEntity> findByStateId = this.stateRepo.findByCountryId(id);
//        Map<Integer,String> states=new HashMap();
//		
//		for(StateEntity i:findByStateId) {
//		states.put(i.getStateId(), i.getStateName());
//		}
//		return states;
//	}
//
//	@Override
//	public Map<Integer, String> getCityById(Integer id) {
//		// 
//		List<CityEntity> cities = this.cityRepo.findByStateId(id);
//		Map<Integer,String> citylist=new HashMap();
//		for(CityEntity i:cities) {
//			citylist.put(i.getCityId(),i.getCityName());
//		}
//		return citylist;
//	}
//	
//	private boolean checkEmail(String emailId) {
//		//
//		UserEntity findByEmailId = this.userRepo.findByEmailId(emailId);
//			if(findByEmailId !=null) {
//			return true;
//		}
//		else {
//			return false;
//			
//		}
//		
//	}
//	private boolean sendEmail(String to,String subject,String pass)  {
//		//
//		try {
//		MimeMessage message = sender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,true);
//        
//       // String password=this.ge;
//         String mesg="<html><body><h3>Here is password </h3>"+pass+" <a href='#'>Click here to verify</a></body></html>";
//         helper.setFrom("feelcoderera@gmail.com","ASHOK IT");
//         helper.setTo(to);
//        helper.setText(pass);
//        helper.setText(mesg, true);
//        
//        helper.setSubject(subject);
//         
//        sender.send(message);
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		return true;
//	}
//	
//	private String generatePass(String emailId,String firstName,String lastName) {
//		int min=1000,max=10000;
//		int b = (int)(Math.random()*(max-min+1)+min);  
//		return ""+b+emailId.charAt(0)+firstName.charAt(1)+lastName.charAt(0);
//		
//	}
//}
