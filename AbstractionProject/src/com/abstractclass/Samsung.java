package com.abstractclass;

public class Samsung extends Mobile {
	
	Samsung(){
		System.out.println("samsung- constructor");
	}

	@Override
	void calling() {
		System.out.println("calling");
		
	}
	
	public static void main(String[] args) {
		Mobile m = new Samsung();
		m.camera();
		m.calling(); //abstract
		System.out.println(m.i);
	}

}
