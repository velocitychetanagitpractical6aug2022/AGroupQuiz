package com.interfaceimplementation;

public class TestImpl implements I1,I2 {

	public void m1() {
		System.out.println("implementation");
	}
	
	public static void main(String[] args) {
		I1 i1 = new TestImpl();
		i1.m1();
		I2 i2 = new TestImpl();
		i2.m1();
	   // i2.m2(); C.E.
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
