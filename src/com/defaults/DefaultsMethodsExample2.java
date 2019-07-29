package com.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class DefaultsMethodsExample2 {

	static Consumer<Student> studentConsumer = (student -> System.out.println(student));

	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

	public static void sortByName(List<Student> studentList) {

		System.out.println("After Sort : ");

		Comparator<Student> sortByName = Comparator.comparing(Student::getName);

		studentList.sort(sortByName);

		studentList.forEach(studentConsumer);

	}

	public static void comparatorChaining(List<Student> studentList) {

		System.out.println("Comparator Chaining : ");

		studentList.sort(gradeComparator.thenComparing(nameComparator));

		studentList.forEach(studentConsumer);

	}

	public static void sortByGpa(List<Student> studentList) {

		System.out.println("After Sort : ");

		Comparator<Student> sortByGradeLevel = Comparator.comparingDouble(Student::getGpa);

		studentList.sort(sortByGradeLevel);

		studentList.forEach(studentConsumer);

	}
	
	public static void sortWithNullValues(List<Student> studentList) {

		System.out.println("After Sort : ");
		
		//Comparator<Student> studentComparato1 = Comparator.nullsFirst(nameComparator);

		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);

		studentList.sort(studentComparator);

		studentList.forEach(studentConsumer);

	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDatabase.getAllStudents();

		System.out.println("Before Sort : ");

		studentList.forEach(studentConsumer);

//		sortByName(studentList);
//
//		sortByGpa(studentList);
//
//		comparatorChaining(studentList);
		
		sortWithNullValues(studentList);
	}

}
