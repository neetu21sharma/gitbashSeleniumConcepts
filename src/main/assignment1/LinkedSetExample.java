package assignment1;

import java.util.LinkedHashSet;
import java.util.Set;

//Write a program using Set interface collection to add countries
public class LinkedSetExample {

	public static void main(String[] args) {
		Set<String> countries = new LinkedHashSet<String>();
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
