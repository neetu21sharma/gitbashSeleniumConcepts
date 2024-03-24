package betaAssignments;

import java.util.LinkedList;
import java.util.List;

public class StringFunctions {

	public static void main(String[] args) {

String name  =" Alphabets";
String number = "110876529";
String car1 = "Highlander";
String deposit = "1000";
String Ucase = "AUTOMOBILE";

//to find the index of character in a string - use indexOf("char") +1 to show the actual count since index starts from 0
System.out.println(car1.indexOf("a")+1);
//to find the char at the given index use charAt
System.out.println(name.charAt(4));
//concatenate method() to add two strings together instead of using "+"
System.out.println(number.concat(name).concat(" ").concat(Ucase));
//to find the length of the given string
System.out.println(name.length());
//replace() methods replaces a single character with the new one in the given string
System.out.println(car1.replace("a", "b"));
//replaceAll replaces the whole string with a new one
//Qs - if I use a $in a string ReplaceAll doesn't work 
System.out.println(deposit.replaceAll("1000", "5000"));
//toLowerCase converts all the uppercase string to lowercase
System.out.println(Ucase.toLowerCase());
//trim() methods removes the spaces in the given string
System.out.println(name.trim());
//
System.out.println(number.substring(0));
//retrieves character from the given string starting at index and then ending index)
System.out.println(car1.substring(3, 9));
//convert the lowercase string to uppercase after trimming
System.out.println(name.trim().toUpperCase());

List ls = new LinkedList();
ls.add(Ucase);
ls.add(deposit);
ls.add(number);
ls.add(name);
ls.add(car1);
System.out.println(ls);




	}

}
