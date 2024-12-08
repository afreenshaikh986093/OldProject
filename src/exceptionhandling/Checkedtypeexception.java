package exceptionhandling;

public class Checkedtypeexception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Statment 1");
		
		Thread.sleep(4000);//---------compile time error or checking whether exception handle or not
		
		
		System.out.println("Statment 2");
	}

}
