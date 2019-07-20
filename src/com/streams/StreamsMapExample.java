package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsMapExample {

	public static List<String> nameList() {

		List<String> studentNameList = StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		return studentNameList;
	}
	
	public static Set<String> nameList1() {

		Set<String> studentNameList = StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());

		return studentNameList;
	}

	public static void main(String[] args) {

		System.out.println(nameList());
		
		System.out.println(nameList1());

	}

}
