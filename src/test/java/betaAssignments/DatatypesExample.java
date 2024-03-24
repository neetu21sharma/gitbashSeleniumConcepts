package betaAssignments;

//program using different datatypes
public class DatatypesExample {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		
		System.out.println("int datatype: " + sum);
		
		System.out.println("--------------------------------------------------");
		
		
	
	
	String states;
	String state1 = "Alabama";
	String state2 = "Chicago";
	String state3 = "Colorado";
	String state4 = "Florida";
	
	states = state1 + " " + state2 + " " + state3 + " " + state4;
	System.out.println("String datatype:" + states);
	System.out.println("--------------------------------------------------");
	
	double num3  = 10.3;
	double num4 = 12.00; 
	double numbers = num3 + num4;
	System.out.println("double datatype:" + numbers);
	System.out.println("--------------------------------------------------");
	
	float num5 = 6.11f;
	boolean isAutomationFun = true;
	
	System.out.println("float datatype :" + num5);
	System.out.println("--------------------------------------------------");
	
	System.out.println("boolean datatype :" + isAutomationFun);
	
	

}
}