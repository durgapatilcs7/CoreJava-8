package com.optional;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class OPtionalOrElseExample {

	public static String OptionalOrElse() {

		Optional<Student> student = Optional.ofNullable(StudentDatabase.supplier.get());

		// Optional<Student> student = Optional.ofNullable(null);

		return student.map(Student::getName).orElse("Default");

	}

	public static String OPtionalOrElseGet() {

		// Optional<Student> student =
		// Optional.ofNullable(StudentDatabase.supplier.get());

		Optional<Student> student = Optional.ofNullable(null);

		return student.map(Student::getName).orElseGet(() -> "Default");

	}
	
	public static String OPtionalOrElseThrow() {

//		 Optional<Student> student =
//		 Optional.ofNullable(StudentDatabase.supplier.get());

		Optional<Student> student = Optional.ofNullable(null);

		return student.map(Student::getName).orElseThrow(() -> new RuntimeException("No data found"));

	}

	public static void main(String[] args) {

		System.out.println(OptionalOrElse());
		System.out.println(OPtionalOrElseGet());
		System.out.println(OPtionalOrElseThrow());

	}

}
