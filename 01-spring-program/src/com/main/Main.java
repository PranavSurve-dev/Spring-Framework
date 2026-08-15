package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	 public static void main(String[] args) {
	     
		 String config_loc = "/com/resources/applicationContext.xml";
		 ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		 
		 Student std = (Student)context.getBean("stdId");
		 std.display();
	}
}

//01-Spring-beans-xxx.jar
//02-Spring-core-xxx.jar
//03-Spring-context-xxx.jar
//04-commons-logging-xxx.jar
//05-Spring-expression-xxx.jar