package com.optional;

import java.util.Optional;

import data.Bike;
import data.Student;
import data.StudentDatabase;

public class OptionalFlatMapExample {

	public static void optionalFlatMap(){
	      Optional<Student> studentOptional =  StudentDatabase.getOptionalStudent();
	      if(studentOptional.isPresent()){
	          Optional<Bike> bikeOptional= studentOptional.
	                  flatMap(Student::getBike); 
	          System.out.println("bikeOptional : " + bikeOptional.get());
	      }
	}

	// filter

	public static void optionalFilter() {

		Optional<Student> studentOPtional = Optional.ofNullable(StudentDatabase.supplier.get());

		studentOPtional.filter(student -> student.getGpa() >= 5.5).ifPresent((s) -> s.getName());

	}

	// map

	public static void optionalMap() {

		Optional<Student> studentOPtional = Optional.ofNullable(StudentDatabase.supplier.get());

		if (studentOPtional.isPresent()) {
			Optional<String> name = studentOPtional.filter(student -> student.getGpa() >= 3.5).map((s) -> s.getName());
			System.out.println(name.get());

		}
	}

	public static void optionalflatMap() {

		Optional<Student> studentOPtional = Optional.ofNullable(StudentDatabase.supplier.get());

		if (studentOPtional.isPresent()) {
			Optional<Integer> st = studentOPtional.filter(student -> student.getGpa() >= 3.5)
					.flatMap((s) -> Optional.ofNullable(s.getNoteBooks()));

			System.out.println(st.get());
		}

	}

	public static void main(String[] args) {

		optionalFilter();

		optionalMap();

		optionalFlatMap();
	}

}
