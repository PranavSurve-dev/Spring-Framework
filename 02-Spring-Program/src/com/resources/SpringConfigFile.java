package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
public class SpringConfigFile {
    @Bean
	public Student stdId1(){
    	
    	Student std = new Student();
    	std.setName("Rohit");
    	std.setRollno(111);
    	std.setEmail("Rohit@gmail.com");
    	
		return std;
		
	}
	
	}
