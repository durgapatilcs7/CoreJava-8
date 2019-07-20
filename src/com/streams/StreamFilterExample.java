package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFilterExample {
	
	public static List<Student> filterStudents(){
		
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGender().equals("female"))
				.filter(s -> s.getName().startsWith("V"))
				.filter(s -> s.getGpa() >= 3.5)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
	
		//System.out.println(filterStudents());
		filterStudents().forEach(System.out::println);
	}

}
