package betaAssignments;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
		//Write a program to display countries in Alphabetical order. TreeSet maintains the alphabetical order 
		TreeSet<String> countries = new TreeSet<String>();
		countries.add("Australia");
		countries.add("Ireland");
		countries.add("Germany");
		countries.add("India");
		countries.add("North America");
		countries.add("South America");
		countries.add("Ireland");
		
		for (String countryNames : countries) 
		{
			System.out.println(countryNames);
		}
	

	}

}
