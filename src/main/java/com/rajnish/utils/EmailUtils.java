package com.rajnish.utils;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.rajnish.binding.User;

@Component
public class EmailUtils {
@Autowired
private JavaMailSender sender;
	public  boolean sendEmail(String to, String subject,String body) {
		System.out.println("11111111111111");
		try {
			MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message,true);
	        
	       // String password=this.ge;
	       //  String mesg="<html><body><h3>Here is password </h3>"+pass+" <a href='#'>Click here to verify</a></body></html>";
	         helper.setFrom("feelcoderera@gmail.com","ASHOK IT");
	         helper.setTo(to);
	        
	         helper.setText(body, true);
	        
	        helper.setSubject(subject);
	         
	        sender.send(message);
			}catch(Exception ex) {
				ex.printStackTrace();
				return false;
			}
			return true;
	}
	
	
}
