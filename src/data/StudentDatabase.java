package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
	
	/**
	 * Total 6 students in database.
	 * @return
	 */
	
	public static Supplier<Student> supplier = () -> {
		return new Student("Durga", 2, 3.6, "female", Arrays.asList("swimming","Singing","Dancing"),9);
	};
	
	public static List<Student> getAllStudents(){
		
		/***
		 * 2nd grade students
		 */
		Student student1 =new Student("Durga", 2, 3.9, "female", Arrays.asList("dreaming","Singing","Dancing"),11);
		Student student2 =new Student("Jyoti", 2, 3.6, "female", Arrays.asList("swimming","Playing","Dancing"),10);
		
		/***
		 * 3rd grade students
		 */

		
		Student student3 =new Student("Priti", 3, 4.6, "female", Arrays.asList("swimming","Singing","Dancing"),9);
		Student student4 =new Student("Pradnya", 3, 3.9, "female", Arrays.asList("swimming","Singing","Dancing"),7);
		
		/***
		 * 4th grade students
		 */

		Student student5 =new Student("Vaishu", 4, 4.0, "female", Arrays.asList("swimming","Singing","Dancing"),15);
		Student student6 =new Student("Vishal", 4, 3.1, "maile", Arrays.asList("swimming","Singing","Dancing"),13);
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
		
		return students;
	}

}
