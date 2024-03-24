package betaAssignments;

//Calling the Addition, Multiplication and Division in main method by creating an object of a class
public class MethodsExample2 {
	
	//global variables can be used anywhere inside the methods
	int num1;
	int num2;
	int num3;
	int num4;
	int sum;
	static String name = "Neetu";
	
	
	public void addition()
	{
		sum = num1 + num2;
		System.out.println(sum);
		
		System.out.println("---------------------------------------------------------------");
	}

	
	public void multiplication()
	{
		sum = num3 * num4;
		System.out.println(sum);
		System.out.println("---------------------------------------------------------------");
	}

	public void division()
	{
		sum = num3 / num4;
		System.out.println(sum);
	    System.out.println("---------------------------------------------------------------");
	}
	
	public void DisplayName()
	{
		System.out.println(name);
		System.out.println("---------------------------------------------------------------");
	}
	
	//Method with parameter and without return type (when declared as parameters the valuse can be changed)	
	public void Add(String fName, String lName)
	{
		fName = "Rosy";
		lName = "Dan";
		String fullName = fName + lName;
		System.out.println("The full name of the person is :" + fullName);
		System.out.println("---------------------------------------------------------------");
	}
	
	public void AddingNames(String fName, String lName)
	{
		System.out.println("The full name of the person is :" + fName + " " + lName);
	}
	
	public int Subtraction(int num5, int num6)
	{
		int sum  = num5 - num6;
		
		return sum;
		
	}
}
