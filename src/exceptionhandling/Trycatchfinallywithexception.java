package exceptionhandling;

public class Trycatchfinallywithexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statment 1");
		
		try {
		
			//risky code
		System.out.println("risky code-inside try block");
		System.out.println(10/0);
		System.out.println("After risky code statment ");
		
		}
		catch (ArithmeticException ex) {
			//body of catch
			System.out.println("inside catch block");
			//method form throwable class which print trace of exception
			ex.printStackTrace();
			
		}
		finally {
			
			System.out.println("clean up code--inside finally block");
		}
		
		
	
		System.out.println("Statment 2");

	}

}
