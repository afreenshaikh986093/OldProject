package Task2;

public class Ecnapsulation {
private double acc_balance=2500.25;
	
	public double getBalance(int acNo) {
		
		return acc_balance;
	}
	
		public void setBalance(double amt, int accNo) {
			
			if (accNo==1234) {
				
				acc_balance =acc_balance + amt;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
