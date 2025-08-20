package application;

import entities.BusinessAccount;
import entities.HerancaAccount;
import entities.SavingsAccount;

public class ProgramHerancaAccount {

	public static void main(String[] args) {
		
		HerancaAccount acc01 = new HerancaAccount(1001, "Alex", 1000.0);
		acc01.withdraw(200.0);
		System.out.println(acc01.getBalance());
		
		HerancaAccount acc02 = new SavingsAccount(1002, "Maria",1000.0, 0.01);
		acc02.withdraw(200.0);
		System.out.println(acc02.getBalance());
		
		HerancaAccount acc03 = new BusinessAccount(1003, "Joao", 1000.00, 500.0);
		acc03.withdraw(200);
		System.out.println(acc03.getBalance());

		HerancaAccount acc = new HerancaAccount(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		
		HerancaAccount acc1 = bacc;
		HerancaAccount acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
		HerancaAccount acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOCWCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
	
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		//POLIMORFISMO
		
		HerancaAccount x = new HerancaAccount(1020, "Alex", 1000.0);
		HerancaAccount y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
