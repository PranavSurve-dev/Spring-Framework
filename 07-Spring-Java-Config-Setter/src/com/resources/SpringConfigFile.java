package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.Student;

@Configuration
public class SpringConfigFile {
@Bean	
public Address createAdrObj() 
{
	Address adr = new Address();
	
	adr.setHouseno(999);
	adr.setCity("Mumbai");
	adr.setPincode(4010);
	
	return adr;
 }
@Bean
public Student createStdObj() 
{
	Student std = new Student();
	
	std.setRollno(11);
	std.setName("Jspider");
	std.setAddress(createAdrObj());
	
	return std;
 }
}
