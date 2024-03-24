package assignment1;

//Write a program to write a table of 2
public class ForLoopExample {

	public static void main(String[] args) {
		
				
		for (int i = 1; i < 11; i++)
		{
			System.out.println(i*2);
		}
		
		System.out.println("-----------------------------------------------------");
		//Write a program to print a table of 4 skipping 4*4 and moving to next
		
		for ( int m = 1; m < 11; m++)
		{
			if (m == 4)
			{
				m++;
			}
			
			System.out.println(m*3);
		}

}
}
