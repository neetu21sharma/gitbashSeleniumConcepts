package betaAssignments;

import java.util.LinkedList;
import java.util.List;

//Write a program to add students in the list collection
//Insertion order is maintained and the duplicates are allowed

public class ListStudents {


	public static void main(String[] args) {
		
		List<String> students = new LinkedList<String>();
		students.add("Neetu");
		students.add("Savita");
		students.add("Aditi");
		students.add("Sonia");
		students.add("Neetu");
		
		System.out.println("The names of the students in Beta batch are :" + students);
		
	}
}