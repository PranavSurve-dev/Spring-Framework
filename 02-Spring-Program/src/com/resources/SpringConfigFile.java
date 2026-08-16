package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Student;

@Configuration
public class SpringConfigFile {
	
    @Bean("stdObj1")
	public Student CreateStdBeanObj1(){
    	
    	Student std = new Student();//Object creation
    	
    	std.setName("Rohit");
    	std.setRollno(111);
    	std.setEmail("Rohit@gmail.com");
    	
		return std;
		
	}
    
    @Bean("stdObj2")
 	public Student CreateStdBeanObj2(){
     	
     	Student std = new Student();
     	std.setName("Omkar");
     	std.setRollno(222);
     	std.setEmail("Omkar@gmail.com");
     	
 		return std;
 		
 	}
	
    @Bean("stdObj3")
 	public Student CreateStdBeanObj3(){
     	
     	Student std = new Student();
     	std.setName("Vedant");
     	std.setRollno(333);
     	std.setEmail("Vedant@gmail.com");
     	
 		return std;
 		
 	}
	}
