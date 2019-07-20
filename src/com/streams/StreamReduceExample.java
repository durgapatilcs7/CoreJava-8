package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import data.Student;
import data.StudentDatabase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integers) {

		return integers.stream().reduce(1, (a, b) -> a * b);

	}

	public static Optional<Integer> performMultiplicationwithouIdentity(List<Integer> integers) {

		return integers.stream().reduce((a, b) -> a * b);

	}

	public static Optional<Student> getHighestGpaStudent() {
		
//		return StudentDatabase.getAllStudents().stream()
//		.reduce((s1,s2) -> {
//			if(s1.getGpa()>s2.getGpa()) {
//				return s1;
//			}else {
//				return s2;
//			}
//		});
		//or
		
		return StudentDatabase.getAllStudents().stream()
				.reduce((s1,s2) -> (s1.getGpa() >s2.getGpa()) ? s1 :s2 );
				
		
		
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 9, 4);

		List<Integer> list1 = new ArrayList<>();

		System.out.println(performMultiplication(list));

		Optional<Integer> mult = performMultiplicationwithouIdentity(list1);

		// System.out.println("Multiplication is : "
		// +performMultiplicationwithouIdentity(list1).get());

		if (mult.isPresent()) {
			System.out.println("Multiplication is : " + performMultiplicationwithouIdentity(list).get());
		} else {
			System.out.println("List is not pesent");
		}
		
		Optional<Student> result = getHighestGpaStudent();
		
		if (result.isPresent()) {
			System.out.println("Highest Gpa student is : " + result.get());
		} else {
			System.out.println("Student is  is not pesent");
		}
		
		

	}

}
