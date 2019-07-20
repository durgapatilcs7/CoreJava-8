package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMAxExample {

	public static Integer findMaxValue(List<Integer> list) {

		return list.stream().reduce(0, (x, y) -> x > y ? x : y);

	}

	public static Optional<Integer> findMinValueWithOptional(List<Integer> list) {

		return list.stream().reduce((x, y) -> x < y ? x : y);

	}
	
	public static Optional<Integer> findMaxValueWithOptional(List<Integer> list) {

		return list.stream().reduce((x, y) -> x > y ? x : y);

	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 6, 9, 75, 81, 22);

		ArrayList<Integer> list1 = new ArrayList<>();

		System.out.println("Max value is : " + findMaxValue(list));
		
		System.out.println("Min value is : " + findMinValueWithOptional(list).get());

		Optional<Integer> maxValueOptional = findMaxValueWithOptional(list1);

		System.out.println("Optional Max value is : " + maxValueOptional);

		if (maxValueOptional.isPresent()) {
			System.out.println("Max value is : " + maxValueOptional.get());
		} else {
			System.out.println("Inpot list is empty");
		}

	}

}
