package com.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.beans") //1st way
@ComponentScan({"com.beans","----","----"}) //2nd way
public class SpringConfigFile 
{

	
}
