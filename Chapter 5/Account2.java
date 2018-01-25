/*******************************************************
 * This class represents an account that can transfer 
 * money, deposit, and withdraw money.
 *
 * @author Cade
 * @version 1/25/2018
 *******************************************************/
public class Account
{
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAcctNum = 1000;
    
    /**
     * returns the next Account Number
     * 
     * @returns next account number
     */
    public static int getNextNum(){
        return nextAcctNum;
    }
    
    /**
     * Constructor -- initializes balance, owner, and account number
     * 
     * @param initBal the initial balance
     * @param owner the name of the owner
     * @param number account number
     */
    public Account(double initBal, String owner, int num) {
        balance = initBal;
        name = owner;
        acctNum = num;
    }
    
    /**
     * Constructor -- initializes balance and owner and a random account number
     * 
     * @param initBal the initial balance
     * @param owner the name of the owner
     */
    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = getNextNum();
        nextAcctNum++;
    }
    
    /**
     * Constructor -- initializes owner and balance of 0 and random account number
     * 
     * @param owner the name of the owner
     */
    public Account(String owner)
    {
        balance = 0;
        name = owner;
        acctNum = getNextNum();
        nextAcctNum++;
    }
    
    /**
     * toString() override
     */
    public String toString(){
        return name + "'s account number is " + acctNum + ".  Balance is $" + balance + ".";
        
    }
    
    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * 
     * @param amount amount to withdraw
     */
    public void withdraw(double amount)
    {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw $" + amount + "0 from " + name + "'s account.  New balance is $" + balance + "0.");
        } else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * 
     * @param amount amount to withdraw
     * @param fee fee to charge in addition to withdrawal
     */
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount + fee) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + "0 plus $" + fee + " fee from " + name + "'s account.  New balance is $" + balance + "0.");
        } else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Adds deposit amount to balance.
     * 
     * @param amount amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    /**
     * Returns balance.
     * 
     * @return balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Returns account name.
     * 
     * @return name of owner
     */
    public String getName()
    {
        return name;
    }
}
