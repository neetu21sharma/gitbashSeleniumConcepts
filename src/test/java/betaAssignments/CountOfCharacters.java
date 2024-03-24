package betaAssignments;

import java.util.HashMap;

public class CountOfCharacters {

	public static void main(String[] args) {
	String str = "selenium";
		HashMap <Character, Integer> chCount = new HashMap<>(); 
		//returns the length of the string
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		//checking if character value exist at the specified index)
		if(chCount.containsKey(str.charAt(i)))   
		{  
		//store the count in a variable
		int count = chCount.get(str.charAt(i)); 
		//if the key exist more than once then add + 1
		chCount.put(str.charAt(i), count+1);  
		
		}   
		else   
		{  
		chCount.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(chCount);  
		}  
		 
		
		

	}


