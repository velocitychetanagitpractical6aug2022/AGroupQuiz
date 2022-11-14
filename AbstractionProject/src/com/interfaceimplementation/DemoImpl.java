package com.interfaceimplementation;

public class DemoImpl implements Demo {

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}
	
	/* default void m4() {
		 System.out.println("Demo - m4");
	 }
*/
	
	public static void main(String[] args) {
		Demo d = new  DemoImpl(); //dynamic dispatch
		d.m1();
		//interface ref = new childclass/implclass
		System.out.println(Demo.i);
		Demo.m2();
		
		d.m4();
		
		
	}



	

}
