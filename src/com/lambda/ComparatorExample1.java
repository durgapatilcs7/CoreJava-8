package com.lambda;

import java.util.Comparator;

public class ComparatorExample1 {

	public static void main(String[] args) {
		
		/**
		 * Prior to java8
		 * 
		 */

		Comparator<Integer> comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);			
			}
		};
		
		System.out.println("Comparator using annonymous : " +comparator.compare(30, 20));
	
		
		/**
		 *java8 using lambda
		 * 
		 */

		Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> {
			return o1.compareTo(o2);
	     };
	     
			System.out.println("Comparator using annonymous : " +comparator2.compare(30, 30));
		
	}
	

}
