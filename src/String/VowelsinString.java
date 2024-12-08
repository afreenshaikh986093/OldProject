package String;

public class VowelsinString {

	public static void main(String[] args) {
		String name ="aefghio";
		
		 
		
	    for (int i =0 ; i<name.length();i++) {
	    	
	    	char ch =name.charAt(i);
	    	
	    	if (ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u') {
	    		
	    		System.out.println("Char " + ch + " is vowel");
	    	}
	    	else {
	    		System.out.println("not a vowels");
	    	}
	    	
	    }

	}

}
