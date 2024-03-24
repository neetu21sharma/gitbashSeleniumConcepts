package betaAssignments;

public class Method2Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsExample2 met = new MethodsExample2();
		met.num1 = 100;
		met.num2 = 200;
		met.num3 = 800;
		met.num4 = 400;
		met.addition();
		met.division();
		met.multiplication();
		met.DisplayName();
		met.AddingNames("Jenny", "Thomas");
		int total = met.Subtraction(50, 20);
		System.out.println(total * 6);
		
		// name is declared as static but we can change the name using the class name and the method name.
		MethodsExample2.name = "Sam";

		System.out.println(MethodsExample2.name);

	}

}
