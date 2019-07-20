package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsExample {
	
	public static void main(String[] args) {
		
		Predicate<Student> studentPredicate = (s -> s.getGradeLevel()>=3);
		
		Predicate<Student> studentPredicate1 = (s -> s.getGpa()>=3.9);
		
		Map<String, List<String>> map = StudentDatabase.getAllStudents().stream()
				.peek((student -> {
					System.out.println(student);
				}))
		.filter(studentPredicate)
		.peek((student -> {
			System.out.println("After first filter : " +student);
		}))
		.filter(studentPredicate1)
		.peek((student -> {
			System.out.println("After second filter : " +student);
		}))
		.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(map);
		
	}

}
