package interfacejava;

public class Implementingclass implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementingclass ic=new Implementingclass();
		ic.m1();
		ic.m2();
		System.out.println(Interface1.x);
		
		ic.m3();
		ic.m4();
		
		System.out.println(Interface2.y);
		
		ic.m5();
		ic.m6();
		
		System.out.println(Interface3.z);
		ic.m7();
		ic.m8();
		
		System.out.println(Interface4.s);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 : implementation for m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 : implementation for m2");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 : implementation for m3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 : implementation for m4");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("Interface3 : implementation for m5");
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("Interface3 : implementation for m6");
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
		System.out.println("Interface4 :implementation for m7");
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		System.out.println("Interface4 : implementation for m8");
		
	}

}
