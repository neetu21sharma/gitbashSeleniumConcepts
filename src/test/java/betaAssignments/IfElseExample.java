package betaAssignments;

//Write a program to see if two numbers are greater than, less than or equal to using 
//if, elseIf
public class IfElseExample {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 40;
		
		if ( num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else if (num2 > num1)
		{
			System.out.println(num2 + " is greater than " + num1);
		}
		else 
			System.out.println("Numbers are equal");
		System.out.println("---------------------------------------------------");
	
	
		//Write a program using if else to see if the child is eligible to drive
		
	int age = 18;
	
	
	if( age <= 16)
	{
		System.out.println ("Child is eligible for a licence");
	}
	else
	{
		System.out.println("Child is not eligible for a licence");
	}
	
}

}