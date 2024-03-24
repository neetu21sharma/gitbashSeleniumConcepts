package betaAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionRevision {
	int StudentID;
	char Grade;
	String name;
	public static void main(String[] args) {
		//Linked List
		
		//Insertion order is maintained, duplicates allowed
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("01");
		lst.add("A");
		lst.add("Sam");
		lst.add("Sam");
		System.out.println(lst);
		System.out.println(lst.contains("01"));
		
		ArrayList<String> fst = new ArrayList<String>();
		fst.add("01");
		fst.add("A");
		fst.add("Sam");
		fst.add("Sam");
		System.out.println(fst);
		
		
		//duplicates not allowed and order not maintained
		Set<String> st = new HashSet<String>();
		st.add("01");
		st.add("A");
		st.add("Sam");
		st.add("Sam");
		st.add("4");
		
		
		System.out.println(st);
		System.out.println(st.size());
		
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("01");
		hs.add("A");
		hs.add("Sam");
		hs.add("Sam");
		
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<String>();
		ts.add("01");
		ts.add("02");
		ts.add("09");
		ts.add("08");
		ts.add("A");
		ts.add("Sam");
		ts.add("Sam");
		
		System.out.println(ts);
		
		
		//Map
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(12, "Sam");
		m.put(14,  "Dean");
		m.put(3,  "Beety");
		m.put(10, "Jolly");
		m.put(18, "Ruby");
		m.put(02, "Jack");
		m.put(07, "Tom");
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println (m.entrySet());
		
		
		
		
		
		
		
		
	}

}
