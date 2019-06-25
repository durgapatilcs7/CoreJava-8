package com.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import data.Student;
import data.StudentDatabase;

public class BiConsumerExample {
	
	
	public static void printNameAndActivity() {
		
		BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " : " + activities);

		 List<Student> students = StudentDatabase.getAllStudents();
		 
		 students.forEach((s -> biConsumer.accept(s.getName(),s.getActivities())));


	}
	
	
	public static void main(String[] args) {
		
		BiConsumer<String, String> b1 = (a,b) -> System.out.println(a.concat(b));
		
		b1.accept("Durga", "Patil");
		
		BiConsumer<Integer, Integer> b2 = (a,b) -> System.out.println(a+b);
		
		BiConsumer<Integer, Integer> b3 = (a,b) -> System.out.println(a/b);
		
		b2.andThen(b3).accept(10, 5);
		
		System.out.println("*********");
		
		printNameAndActivity();
		
	}

}
