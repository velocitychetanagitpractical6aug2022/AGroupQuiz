package com.demo;

public class TransactionImpl implements TransactionI{

	@Override
	public void withdrawAmt(int amtToWithdraw) {
	
		 System.out.println("implementation");
		
	}
	
	public static void main(String[] args) {
		TransactionI t = new TransactionImpl();
		t.withdrawAmt(1000);
	}

}
