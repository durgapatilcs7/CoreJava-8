package com.optional;

import java.util.Optional;

import data.Student;

public class OptionalExample {

	public static String getName() {

		//Student student = StudentDatabase.supplier.get();

		Student student = null;
		
		System.out.println(student);
		
		if (student != null) {
			return student.getName();
		}

		return null;

	}
	
	public static Optional<String> getNameWithOptional() {
		
		//Optional<Student> student1 = Optional.ofNullable(StudentDatabase.supplier.get());
		
		Optional<Student> student1 = Optional.ofNullable(null);
		
		System.out.println(student1);
		
		if(student1.isPresent()) {
			
			return student1.map(Student::getName);
		}
		
		return Optional.empty();
		
	}

	public static void main(String[] args) {
		
		String name = getName();
		
		//System.out.println(name.length());
		
		if (name != null) {
			System.out.println(name.length());
		} else {
			System.out.println("Name not found");
		}
		
		Optional<String> nameOptional = getNameWithOptional();
			
		if(nameOptional.isPresent()) {
			System.out.println("Length ofStudent Name : "+nameOptional.get().length());
		}else {
			System.out.println("Name not found");
		}

		
	}
}
