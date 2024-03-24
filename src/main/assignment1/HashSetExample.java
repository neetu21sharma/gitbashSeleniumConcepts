package assignment1;

import java.util.HashSet;

//HashSet doesn't maintain any insertion order and ignore the duplicates because every item in a set has to be unique
public class HashSetExample {

	public static void main(String[] args) {
	//Write a program to add different courses 
		
		HashSet<String> courses= new HashSet<String>();
		courses.add("Data Structures");
		courses.add("Python Programming");
		courses.add("Intro to Computer Science");
		courses.add("Automation class");
		courses.add("Intro to Java");
		courses.add("Automation class");
		System.out.println(courses.contains("Data Structures"));
		
		for (String courseName : courses) 
		{
			System.out.println(courseName);
			
		}
		
		

	}

}
