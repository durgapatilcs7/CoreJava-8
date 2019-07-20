package com.lambda;

import java.util.function.Consumer;

public class LamdaVariableExample2 {

	static int value = 4;
	
	public static void main(String[] args) {
		
		//local variable
		
		 Consumer<Integer> consumer = (i) -> {
			value++;
			System.out.println(value+i);
			
		};
		
		consumer.accept(5);
		
	}
}
