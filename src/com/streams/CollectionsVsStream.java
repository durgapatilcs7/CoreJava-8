package com.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("adam");
		names.add("jim");
		names.add("jinny");
		
		//we can iterate collection any no of times
		
		for (String string : names) {
			System.out.println(string);
		}
		

		for (String string : names) {
			System.out.println(string);
		}

		names.remove(0);
		System.out.println(names);
		
		//streams cant modify,add or remove elements
		
		Stream<String> stream = names.stream();
		
		stream.forEach(System.out::println);
		//stream.forEach(System.out::println); we cant iterate stream more tha once
	}

}
