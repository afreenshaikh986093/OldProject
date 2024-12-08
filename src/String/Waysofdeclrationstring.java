package String;

public class Waysofdeclrationstring {

	public static void main(String[] args) {
		//first way of string declaration
	     String name ="Velocity";
	     
	     
	     String name1 = "Velocity";
	     
	     //content comparison
	     System.out.println(name.equals(name1));//true
	     
	     //object comparison
	     System.out.println(name==name1);//true
	
	     
	     //second way -using new keyword-
	     
	     String place =new String("Pune");
	     
	     String place2 =new String ("Pune");
	     
	     //content comparison
	     System.out.println(place.equals(place2));//true
	     
	     //object comparison
	     System.out.println(place==place2);//false
		
	

	}

}
