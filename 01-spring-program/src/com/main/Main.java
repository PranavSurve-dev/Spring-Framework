package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	 public static void main(String[] args) {
	     
		 String config_loc = "/com/resources/applicationContext.xml";
		 ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		 System.out.println("Data Read from Spring Container");
		 System.out.println("----------------------------------");
		 Student std1 = (Student)context.getBean("stdId1");
		 std1.display();
		 System.out.println("=========================");
		 Student std2 = (Student)context.getBean("stdId2");
		 std2.display();
		 System.out.println("=========================");
		 Student std3 = (Student)context.getBean("stdId3");
		 std3.display();
	}
}

//01-Spring-beans-xxx.jar
//02-Spring-core-xxx.jar
//03-Spring-context-xxx.jar
//04-commons-logging-xxx.jar
//05-Spring-expression-xxx.jar