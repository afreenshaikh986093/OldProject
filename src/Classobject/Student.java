package Classobject;

public class Student {
		//State /Variable/data
		String name="Afreen";
		
		int age=25;
		
		char div='A';
		
		//methods/actions
		
		public void studying() {
			
			System.out.println(name+ " is studying now in BE");
		}
		

		public static void main(String[] args) {
				//create object of class
		
				Student ref=new Student();
				ref.studying();
				System.out.println(ref.age);
				System.out.println(ref.div);
	}

}
