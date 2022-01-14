package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(12321, 10000);
		acc1.info();
		
		//Deposit dep = new Deposit();		
		acc1.Deposit(5000);
		acc1.info();
		acc1.Withdraw(20000);
		acc1.info();
		
		//acc1 에서 acc2로 5,000원 이체
		Account acc2 = new Account(22222, 3000);
		acc2.info();
		
		acc1.Transfer(3000, acc2);
		acc1.info();
		acc2.info();
		

	}

}
