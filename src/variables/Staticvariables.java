package variables;

public class Staticvariables {

	//B.Static Variable

	static int rollno=30;
	public static void sv() {
		
	System.out.println("static method");
	}
	public static void sv1() {
			
			System.out.println("static method1");
			sv();
		}
	
	
	
	public static void main(String[] args) {
		Staticvariables.sv1();
		System.out.println(rollno);
		rollno=40;
		System.out.println(rollno);

	}

}
