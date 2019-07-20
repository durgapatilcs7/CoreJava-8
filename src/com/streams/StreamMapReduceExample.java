package com.streams;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class StreamMapReduceExample {
	
	private static Optional<Integer> noOfNoteBooks() {
		
		Optional<Integer> noOfnotebooks = StudentDatabase.getAllStudents().stream()
				.filter((student -> student.getGradeLevel()>=3))
				.filter(student -> student.getGender().equals("female"))
				.map(Student::getNoteBooks)
				//.reduce(0,(a,b) -> a+b);
				.reduce(Integer::sum);
		return noOfnotebooks;
	}

	public static void main(String[] args) {
		System.out.println("No OF notebooks : " +noOfNoteBooks().get());
	}
}
