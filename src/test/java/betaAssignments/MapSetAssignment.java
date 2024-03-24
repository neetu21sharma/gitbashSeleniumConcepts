package betaAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSetAssignment {

	public static void main(String[] args) {
		
		HashMap<String, Integer> studName = new HashMap<String, Integer>();
		studName.put("John", 1);
		studName.put("Kevin", 2);
		studName.put("Reena", 3);
		studName.put("Jake", 4);
		studName.put("Kate", 5);
		studName.put("Joseph", 6);
		studName.put("Kate", 7);
		studName.put("Rhea", 9);

		System.out.println(studName.size());
		System.out.println("Id of Jake :" + studName.get("Jake"));
		Set<String> setOfKeys = studName.keySet();
		for (String l : setOfKeys) {
			System.out.println("Key is :: " + l);
			System.out.println("Value is " + studName.entrySet());

		}
		
		System.out.println("--------------------------------------------------------");
		
		LinkedHashMap<String, Integer> studName1 = new LinkedHashMap<String, Integer>();
		studName1.put("John", 1);
		studName1.put("Kevin", 2);
		studName1.put("Reena", 3);
		studName1.put("Jake", 4);
		studName1.put("Kate", 5);
		studName1.put("Joseph", 6);
		studName1.put("Kate", 7);
		studName1.put("Rhea", 9);
		Set<String> sj = studName.keySet();
		for (String b : sj)
		{
			System.out.println(b);
			System.out.println(studName.entrySet());
		}
		

		// You can only get the object key using the get()method but u can't get the value
		// using get method)

	
		System.out.println("-----------------------------------------------------");
		

		Map<Integer, String> fruits = new TreeMap<Integer, String>();
		fruits.put(1, "Apple");
		fruits.put(2, "Banana");
		fruits.put(3, "Guava");
		fruits.put(4, "JackFruit");

		System.out.println(fruits.get(3));
		Set<Integer> s = fruits.keySet();
		for (Integer ks1 : s) {
			System.out.println(ks1);
		}
		System.out.println(fruits.entrySet());

		LinkedHashMap<Character, String> lhs = new LinkedHashMap<Character, String>();
		lhs.put('A', "Apple");
		lhs.put('B', "BullDog");
		lhs.put('1', "Heart");
		lhs.put('F', "Jake");
		lhs.put('G', "Kettle");
		lhs.put('M', "BullDog");
		lhs.put('B', "BullDog");
		System.out.println(lhs);

		Set<Character> sk = lhs.keySet();
		for (Character cc : sk) {
			System.out.println(cc);
			System.out.println(lhs.get(cc));
		}

	}

}
