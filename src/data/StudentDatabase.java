package data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	/**
	 * Total 6 students in database.
	 * @return
	 */
	
	public static List<Student> getAllStudents(){
		
		/***
		 * 2nd grade students
		 */
		Student student1 =new Student("Durga", 2, 3.9, "female", Arrays.asList("swimming","Singing","Dancing"));
		Student student2 =new Student("Jyoti", 2, 3.6, "female", Arrays.asList("swimming","Singing","Dancing"));
		
		/***
		 * 3rd grade students
		 */

		
		Student student3 =new Student("Priti", 3, 4.6, "female", Arrays.asList("swimming","Singing","Dancing"));
		Student student4 =new Student("Pradnya", 3, 3.9, "female", Arrays.asList("swimming","Singing","Dancing"));
		
		/***
		 * 4th grade students
		 */

		Student student5 =new Student("Vaishu", 4, 4.0, "female", Arrays.asList("swimming","Singing","Dancing"));
		Student student6 =new Student("Vishal", 4, 3.1, "female", Arrays.asList("swimming","Singing","Dancing"));
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
		
		return students;
	}

}
