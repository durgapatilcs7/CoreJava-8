package com.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import data.Student;

public class ConstructorReferenceExample {
	
	public static Supplier<Student> studentSupplier = Student::new;
			
	public static Function<String,Student> studentFunction = Student::new;
	
	public static void main(String[] args) {
		
		System.out.println(studentSupplier.get());
		
		System.out.println(studentFunction.apply("ABC"));
		
	}

}
