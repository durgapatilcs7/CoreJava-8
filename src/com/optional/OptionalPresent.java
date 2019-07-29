package com.optional;

import java.util.Optional;

public class OptionalPresent {

	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("HIIII");
		
		String str = "how are you";
		if (optionalString.isPresent()) {
			System.out.println(optionalString.get().concat(" Durga"));
			
			String [ ] string1 = str.split(" ");
			
			for (String string : string1) {
				System.out.println(string);
			}
			
			
		}
		
		optionalString.ifPresent((s) -> System.out.println(s.charAt(0)));
		
	}

}
