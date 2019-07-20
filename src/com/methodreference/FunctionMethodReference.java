package com.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {
	
	static Function<String, String> funtion = (name) -> name.toUpperCase();
	
	static Function<String, String> funtion1 = String::toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println(funtion.apply("java"));
		
		System.out.println(funtion1.apply("java and spring"));
		
	}
	
	

}
