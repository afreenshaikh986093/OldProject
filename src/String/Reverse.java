package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="afreen";
		
		String name1="";
	
		
		for (int i =name.length()-1 ; i>=0;i--) {
			
			name1 =name1+name.charAt(i);
			
		}
		
	  System.out.println("Reverse String: " + name1);

	}

}
