package variables;

public class Globalvariables {
		//1.Global variable  !!!!!!!!!!!!!!!!!
		//A.Instace Variable
	int rollno=20;
	float f;
	public void gv() {
		
		System.out.println("global method");
	}
	public void gv1() {
			
			System.out.println("global method2");
			gv();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Globalvariables GV=new Globalvariables();
		GV.gv1();
		System.out.println(GV.rollno);
		GV.rollno=40;
		System.out.println(GV.rollno);
		
		System.out.println(GV.f);
	}}	
		
	
	//B.Static Variable

//	static int rollno=30;
//	public static void gv() {
//		
//		System.out.println("static method");
//	}
//	public static void gv1() {
//			
//			System.out.println("static method1");
//			gv();
//		}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Globalvariables.gv1();
//		System.out.println(rollno);
//		rollno=40;
//		System.out.println(rollno);
//		
//	}
//	
	//1.Local variable  !!!!!!!!!!!!!!!!!
	
//	public void Lv() {
//		int rollno=90;
//		System.out.println("local method");
//		System.out.println(rollno);
//		
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Globalvariables GV=new Globalvariables();
//		GV.Lv();
//		
//		
		
//	}
	


