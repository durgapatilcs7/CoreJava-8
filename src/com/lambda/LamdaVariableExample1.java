package com.lambda;

import java.util.function.Consumer;

public class LamdaVariableExample1 {

	public static void main(String[] args) {
		
		int i = 0;
		
		 Consumer<Integer> consumer = (i1) -> {
			
			System.out.println("The value is : " + i);
		};
		
		consumer.accept(8);
		
	}
}
