package Classobject;

public class Dog {

	public static void main(String[] args) {
		//object create
		
		Dog var=new Dog();
		
		var.barking();
	}
	
	
	String name="Labrador";
	
	int age=10;
	
	public void barking() {
		
		System.out.println(name + " Is barking");

	}

}
