package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamsComparatorExample {

	public static List<Student> printStudentUSingComparator() {

		List<Student> studentUSingComparator = StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

		return studentUSingComparator;

	}

	public static List<Student> sortStudentByGpa() {

		List<Student> studentUSingComparator1 = StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());

		return studentUSingComparator1;

	}

	public static List<Student> sortStudentByGpaDesc() {

		List<Student> studentUSingComparator1 = StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());

		return studentUSingComparator1;

	}

	public static void main(String[] args) {

		System.out.println("Students sort by name : ");
		System.out.println(printStudentUSingComparator());

		System.out.println("Students sort by GPA : ");
		System.out.println(sortStudentByGpa());

		System.out.println("Students sort by GPA Desc: ");
		System.out.println(sortStudentByGpaDesc());

	}
}
