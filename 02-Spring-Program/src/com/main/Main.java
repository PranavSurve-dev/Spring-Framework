package com.main;

import org.springframework.cache.annotation.AnnotationCacheOperationSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Student;
import com.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
//   		Student std = (Student) context.getBean("stdId1");
//		std.display();
		
//      	Student std = context.getBean(Student.class);
//		std.display();
		
		System.out.println("Types of data reading");
		
		System.out.println("========================");
		
		Student std1 = (Student) context.getBean("stdObj1");
		std1.display();
		
		System.out.println("-----------------------------");
		
		Student std2 = (Student) context.getBean("stdObj2");
		std2.display();
		
		System.out.println("-----------------------------");

		Student std3 = (Student) context.getBean("stdObj3");
		std3.display();
	}
}
