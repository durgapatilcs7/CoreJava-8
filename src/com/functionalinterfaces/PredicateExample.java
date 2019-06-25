package com.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> predicate = (a) -> {
		return a % 2 == 0;
	};

	static Predicate<Integer> p1 = (a) -> a % 2 == 0;

	static Predicate<Integer> p2 = (a) -> a % 5 == 0;

	public static void predicateAnd() {
		System.out.println("Pradicate And result is : " +p1.and(p2).test(8));
	}

	public static void predicateOr() {
		System.out.println("Pradicate or result is : " +p1.or(p2).test(8));
	}

	public static void predicateNegate() {
		System.out.println("Pradicate Negate result is: " +p1.or(p2).negate().test(8));
	}
	
	public static void main(String[] args) {

		System.out.println(predicate.test(10));

		System.out.println(p1.test(10));

		predicateAnd();

		predicateOr();
		
		predicateNegate();

	}
}
