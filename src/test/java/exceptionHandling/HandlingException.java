package exceptionHandling; 
public class HandlingException {

	public static void main(String[] args) {
		  
		
		      int a=5; 
		      int b=0; 
		        try{ 
		          System.out.println(a/b); 
		        } 
		      catch(ArithmeticException e){ 
		    	//exception information using printStackTray()method
		        e.printStackTrace(); 
		        //exception information in the format of the exception : description of exception using toString()method 
		        System.out.println(e.toString());
		        //exception information using get message
		        System.out.println(e.getMessage()); 
		      } 
		    } 
		
		
		
		}


