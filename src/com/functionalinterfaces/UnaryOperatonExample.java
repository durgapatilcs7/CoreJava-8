package com.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatonExample {
	
	static UnaryOperator<String> unary = ( name -> name.concat("Patil"));
	
	public static void main(String[] args) {
		
		System.out.println(unary.apply("Durga "));
		
		
	}

}
