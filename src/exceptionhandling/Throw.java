package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Throw {
	public static void login(String username, String pass) throws Exception {
		
		 if (username.equals("abc@gmail.com") && pass.equals("abc123")) {
			 
			 
			 System.out.println("Successfully login");
		 } 
		 else {
			 
			 throw new Exception ("Username or Password is incorrect");
		 }
		 }
		
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		login ("abc@gmail.com", "abc123");
	}

}
