package Chapter04;

/**
 * This class represents a bank account.  Deposits, withdrawals,
 * and name changes can be made.
 * 
 * @author rich8125
 * @version 10/12/2017
 */

public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	
	/**
	 * Constructor -- initializes balance, owner, and account number
	 */
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	/**
	 * Checks to see if balance is sufficient for withdrawal.
	 * If so, decrements balance by amount; if not, prints message.
	 */
	public void withdraw(double amount)
	{
		if (balance >= amount) {
			balance -= amount;
			System.out.print("Withdrawal made.  ");
		} else
		   System.out.println("Insufficient funds");
	}
	
	/**
	 * Adds deposit amount to balance.
	 */
	public void deposit(double amount)
	{
		balance += amount;
		System.out.print("Deposit made.  ");
	}
	
	/**
	 * Method to get account's balance.
	 * @return The balance of the account
	 */
	public double getBalance()
	{
		return balance;
	}
	
	
	/**
	 * toString override to get a string representation of the object
	 * @return a string containing the name, account number, and balance.
	 */
	public String toString()
	{
		return name + "'s account\nBalance: " + balance + "\nAccount number: " + acctNum;
	
	}
	
	/**
	 * Deducts $10 service fee
	 */	
	public double chargeFee()
	{
		System.out.print("Service fee charged.  ");
		return balance -= 10;
	}
	
	/**
	 * Changes the name on the account 
	 * @param newName - the account's new name
	 */
	public void changeName(String newName)                   
	{
		System.out.println("Name changed from " + name + " to " + newName + ".");
		name = newName;
	}

}
