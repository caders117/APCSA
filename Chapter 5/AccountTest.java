package ch05;

public class AccountTest {
	public static void main(String[] args){
		Account acc1 = new Account(1000, "John", 1234);
		Account acc2 = new Account("Sally");
		Account acc3 = new Account(5500, "Tommy");
		
		acc1.deposit(100);
		acc1.withdraw(500);
		System.out.println(acc1 + "\n");
		
		acc2.deposit(5000);
		acc2.withdraw(150, 2.5);
		acc2.withdraw(5000);
		System.out.println(acc2 + "\n");
		
		acc3.withdraw(500);
		System.out.println(acc3);
	}
}
