package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleExceptionswiththrows {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		//not gurantee to terminate program noramally.
		  
		System.out.println("Statment 1");
		
		Thread.sleep(4000);
		
		FileInputStream fis =new FileInputStream("gdsgd//dushdhsd//dhsgdgs");
		
		
		System.out.println("Statment 2");
		

	}

}
