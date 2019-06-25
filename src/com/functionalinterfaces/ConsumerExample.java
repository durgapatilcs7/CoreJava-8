package com.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;
import data.Student;
import data.StudentDatabase;

public class ConsumerExample {

	static Consumer<Student> s1 = (s) -> System.out.print(s.getName());

	static Consumer<Student> s2 = (s) -> System.out.println(s.getActivities());

	static List<Student> students = StudentDatabase.getAllStudents();

	public static void printNames() {

		Consumer<Student> con = (s) -> System.out.println(s);

		students.forEach(con);

	}

	public static void printNameAndActivity() {

		students.forEach(s1.andThen(s2));// consumer chaining

	}

	public static void printNameAndActivityUsingCondition() {

		System.out.println("printNameAndActivityUsingCondition");

		students.forEach((student -> {
			if (student.getGradeLevel() >= 4 && student.getGpa() >= 3.9) {
				s1.andThen(s2).accept(student);
			}
		}));

	}

	public static void main(String[] args) {
		
		

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("java8");

		Consumer<Integer> c2 = (s) -> System.out.println(s.equals(7));

		c2.accept(7);

		Consumer<Character> c3 = (s) -> System.out.println(s.equals('g'));

		c3.accept('d');

		System.out.println("**********");

		printNames();

		System.out.println("**********");

		printNameAndActivity();

		printNameAndActivityUsingCondition();
	}

}
