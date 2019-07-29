package com.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodsExample {
	
	public static void main(String[] args) {
		/*
		 * Sort list of names alphabetical order
		 */
		List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");
		
		
		/*
		 * Prior java 8
		 */
		
//		Collections.sort(stringList);
//		
//		System.out.println("Sorted list using collection : "+stringList);
		
		/*
		 * java 8
		 */
		
		stringList.sort(Comparator.naturalOrder());
		
		System.out.println("Sorted list using collection : "+stringList);
		
		stringList.sort(Comparator.reverseOrder());
		
		System.out.println("Sorted list using collection : "+stringList);
		
	}

}
