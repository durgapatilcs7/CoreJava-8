package com.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatoeExample {
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

	public static void main(String[] args) {
		
		BinaryOperator<Integer> binary = (a,b) -> a+b;
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);	
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		
		System.out.println("Result of maxBy is : " + maxBy.apply(8, 3));
		
		System.out.println("Result of minBy is : " + minBy.apply(8, 3));
		
		System.out.println(binary.apply(10, 20));
	}
}
