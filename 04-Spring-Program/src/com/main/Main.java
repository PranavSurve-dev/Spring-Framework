package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;
import com.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext Context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		
		Student std = (Student)Context.getBean("student");
		std.display();
	}
}
