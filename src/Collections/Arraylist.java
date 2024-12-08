package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		 
		 
		 al.add("Banglore");
		 al.add("Hyderabad");
		 al.add("Delhi");
		 al.add("Mumbai");
		 
		 System.out.println(al);
		
		 //list to Array  conversion
		 
		 String [] valNew= new String[al.size()];
		 al.toArray(valNew);
		 
		 for (String cities  : valNew) {
			 
			 System.out.println(cities);
		 }	
		 
		 
		//Array to list conversion
		 
		 String[] val = {"Delhi","Mumbai","Dio"};
		 ArrayList<String> al1 =new ArrayList<String>();
		 
		 al1.addAll(Arrays.asList(val));
		 System.out.println(al1);
		 
		 

	}

}
