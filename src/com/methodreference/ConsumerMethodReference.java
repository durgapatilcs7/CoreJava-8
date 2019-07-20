package com.methodreference;

import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerMethodReference {

	
	//static Consumer<Student> c1 = (student -> System.out.println(student));
	
	static Consumer<Student> c1 = System.out::println;
	
	static Consumer<Student> c2 = Student::printActivities;
	
	public static void main(String[] args) {
		
		StudentDatabase.getAllStudents().forEach(c1);
		
		StudentDatabase.getAllStudents().forEach(c2);
	}
	
}
 