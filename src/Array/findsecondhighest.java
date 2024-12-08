package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findsecondhighest {

	public static void main(String[] args) {
		
		
		int [] var = {80,30,50,70,90,60};
		
		Arrays.sort(var);
		
		System.out.print(var[var.length-1]);
		
	}
}
