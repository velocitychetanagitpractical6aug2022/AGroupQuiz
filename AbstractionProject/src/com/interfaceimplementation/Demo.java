package com.interfaceimplementation;

public interface Demo {
	
     int i =10;  //public static final int i = 10;
	
	//String str = "abc"; //public static final String str ="abc";
	
	 void m1();  // public abstract void m1();
	/*
	 private int add(int a, int b) {
		 return a+b;
	 }*/
	 
	 static void m2() {
		 System.out.println("Demo - m2");
	 }
	 
	/* static float percentage(int addition) {
		 addition = add(10,20);
		 float percentage = addition/2;
		 return percentage;
	 }*/
	 
/*	 private void m3() {
		 System.out.println("Demo- 3");
	 }*/
	 
	 default void m4() {
		 System.out.println("Demo - m4");
	 }

}
