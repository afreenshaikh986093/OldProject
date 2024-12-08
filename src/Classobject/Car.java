package Classobject;

public class Car {
		//property- variable
		String color="red";
		
		//behaviour -method
		public void drive() {
			
			System.out.println("Car driving with " +"\n"+ "color "+color );
		}

	public static void main(String[] args) {

		//Object create
		//ClassName variable =new ClassName();
		Car var=new Car();
		
	    var.drive();
		

	}

}
