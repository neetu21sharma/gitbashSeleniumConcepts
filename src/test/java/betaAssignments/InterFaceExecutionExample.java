package betaAssignments;

public class InterFaceExecutionExample implements InterfaceExample {

	int a = 6;
	int b = 10;
	int c = 12;
	int d = 20;

	public static void main(String[] args) {
		
		InterFaceExecutionExample e = new InterFaceExecutionExample();
		e.add();
		e.subtract();
		e.multiplication();
		e.division();
		
	
	}

	@Override
	public void add()
	{
		int sum = a + b;
		System.out.println(sum);
	}

	@Override
	public int subtract() {
		int sub = (d-c); 
		System.out.println(sub);
		int total = sub + a;
		System.out.println(total);
		return total;
		
	}

	@Override
	public void multiplication() {
		int mul = (c*a);
		System.out.println(mul);
	}

	@Override
	public void division() {
		int div = (d/b)*c;
		System.out.println(div);
		
	}

}
