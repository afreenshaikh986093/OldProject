package Array;

public class Oddnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {30,23,60,12,17,69};
		   
		   int count=0;
		   for (int i=0; i<=arr.length-1; i++) 
		   {
		   
		   if ( i%2!=0) 
		   {
			   count++;
		     
		   }
		   }
		   System.out.println("total odd nos is : " + count );
	}

}
