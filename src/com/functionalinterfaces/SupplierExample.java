package com.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDatabase;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> supplier = () -> {
			return new Student("Durga", 2, 3.9, "female",20, Arrays.asList("swimming", "Singing", "Dancing"));
		};
		
		Supplier<List<Student>> supplier1 = () -> StudentDatabase.getAllStudents();
			
		System.out.println("Student is : " + supplier1.get());
		
		System.out.println("************");
		
		System.out.println("Student is : " + supplier.get());

	}

}
