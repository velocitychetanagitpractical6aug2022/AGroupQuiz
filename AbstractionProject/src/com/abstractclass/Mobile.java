package com.abstractclass;

public abstract class Mobile {
	
	int i;
	
	Mobile(){
		System.out.println("mobile constructor");
	}
	
	abstract void calling();
	
	void camera() {
		System.out.println("Mobile-camera");
	}

}
