package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String resource_file_path="/com/resources/applicationContext.xml";
		ApplicationContext Context = new ClassPathXmlApplicationContext(resource_file_path);
		
		
		Student std = (Student)Context.getBean("student");
		std.display();
	}
}
