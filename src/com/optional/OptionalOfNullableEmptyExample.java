package com.optional;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {
	
	public static Optional<String> ofNullable(){
		
		Optional<String> str = Optional.ofNullable("Hello");
		
		return str;
		
	}
	
public static Optional<String> of(){
		
		Optional<String> str = Optional.of("Hello");
		
		return str;
		
	}

public static Optional<String> empty(){
	
	 return Optional.empty();
	
	
}
	
	public static void main(String[] args) {
		System.out.println(" ofNullable() :"  + ofNullable());
		System.out.println(" of() :"  + of());
		System.out.println(" empty() :"  + empty());
	}

}
