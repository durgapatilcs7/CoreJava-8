package com.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

	static Predicate<Student> p2 = (student) -> student.getGpa() > 3.9;

	public static void filterStudentByGradeleval() {

		System.out.println("filterStudentByGradeleval : ");

		List<Student> students = StudentDatabase.getAllStudents();

		students.forEach((student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		}));

	}

	public static void filterStudentByGpa() {

		System.out.println("filterStudentByGpa : ");

		List<Student> students = StudentDatabase.getAllStudents();

		students.forEach((student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}
		}));

	}

	public static void filterStudents() {

		System.out.println("filterStudents : ");

		List<Student> students = StudentDatabase.getAllStudents();

		students.forEach((student -> {
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			}else {
				System.out.println(student);
			}
		}));
		
	}

	public static void main(String[] args) {

		filterStudentByGradeleval();

		filterStudentByGpa();

		filterStudents();

	}

}
