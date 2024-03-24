package StaticAndNonStatic;

public class staticVaribles {

	static int a = 5;
	 //static variable can be accessed in a static method without creating an object of a class
		    // static method(main !!)
		    public static void main(String[] args)
		    {
		       System.out.println(a);
		      // System.out.println(staticVaribles.a);
		       
		       //Accessing the value of non static variable in a static method throws an error
		    //   System.out.println(b);
		       
		       //to access the value of non static variable in a static method you need to create an instance of a class
		       staticVaribles sv = new staticVaribles();
		      System.out.println(sv.b);
		    }
		    
		    int b = 10;
		     
		   
		
	}


