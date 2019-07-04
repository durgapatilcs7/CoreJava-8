package com.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> functionalInterface = (name -> name.toUpperCase());
	
	static Function<String, String> addSomeString = (name -> name.concat("default"));
			
	public static void main(String[] args) {
		
		System.out.println(functionalInterface.apply("JavaDurga"));
		
		System.out.println(functionalInterface.andThen(addSomeString).apply("Java"));
		
		System.out.println(functionalInterface.compose(addSomeString).apply("Java"));
	}

}
