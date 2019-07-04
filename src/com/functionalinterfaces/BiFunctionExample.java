package com.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students,studentPradicate) -> {
		Map<String, Double> map = new HashMap<>();
		
		students.forEach(student -> {
			if(studentPradicate.test(student)) {
				map.put(student.getName(), student.getGpa());
			}
		});
		
		return map;
		
	});
	
	public static void main(String[] args) {
		
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.p2));
		
	}
}
