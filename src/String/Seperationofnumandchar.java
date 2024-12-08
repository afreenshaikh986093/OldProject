package String;

public class Seperationofnumandchar {

	public static void main(String[] args) {
		String name ="Fsd#12@34gs5$2sf6qkl";
		
	    String no ="";
	    
	    String alpha ="";
		
	    for (int i =0 ; i<name.length();i++) {
	    	
	    	char ch =name.charAt(i);
	    	
	    	if (Character.isDigit(ch)) {
	    		
	    		no = no+ch;
	    		
	    	}
	    	else if (Character.isAlphabetic(ch)) {
	    		
	    		alpha=alpha + ch;
	    	}
	    	
	    	
	    }
	    
	    System.out.println("No from given string " + no) ;
	    System.out.println("Alphabets from given string " + alpha) ;
	    

		}


	
}
