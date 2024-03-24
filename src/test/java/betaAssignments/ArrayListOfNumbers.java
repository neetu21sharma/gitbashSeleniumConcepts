package betaAssignments;

import java.util.ArrayList;

//Write a program to add integers in the ArrayList
public class ArrayListOfNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// To access an element at index 3 using the get() method
		System.out.println("Access an elment at index(3) using get method():" + numbers.get(3));

		System.out.println("----------------------------------------------");

		System.out.println("To find out how many elements in an ArrayList using the size method():" + numbers.size());

		// To modify an element using the set method() using the index
		numbers.set(1, 80);

		// To remove the element using remove method()

		numbers.remove(3);

		System.out.println("-------------------------------------------------");

		System.out.println("Printing all the numbers in the ArrayList");
		for (Integer nums : numbers) {
			System.out.println(nums);

		}
		
		
	}


}
