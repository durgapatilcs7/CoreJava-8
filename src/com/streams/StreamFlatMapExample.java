package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFlatMapExample {
	
	public static List<String> printStudentactivities(){
		
		List<String> studentActivities = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		return studentActivities;
		
	}
	
public static long printStudentactivitiesCount(){
		
		long studentActivitiesCount = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
		
		return studentActivitiesCount;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Activities are : " +printStudentactivities());
		
		System.out.println("Activities are : " +printStudentactivitiesCount());
	}

}
