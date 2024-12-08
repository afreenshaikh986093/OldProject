package exceptionhandling;

public class Multiplecatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Statment 1");
		
		String s =null;
		
		try {
		
			//risky code
		System.out.println("risky code-inside try block");
		s.equals("Hi");
		
		System.out.println("After risky code statment ");
		
		}
		catch (ArithmeticException ex) {
			//body of catch
			System.out.println("inside catch block");
			ex.printStackTrace();
			
		}
		catch (RuntimeException ex) {
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
