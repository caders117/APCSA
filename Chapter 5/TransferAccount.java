//*******************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//*******************************************************
public class Account
{
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAcctNum = 1000;
    
    public static void transfer(Account acct, Account acct2, double amount) {
        acct.transfer(acct2, amount);
    }
        
    
    public void transfer(Account acct, double amount) {
        this.withdraw(amount);
        acct.deposit(amount);
        System.out.println("Transferred " + amount + " from " + name + "'s account to " + acct.getName() + "'s account."); 
    }
    
    public static int getNextNum(){
        return nextAcctNum;
    }
    
    public Account(double initBal, String owner, int num) {
        balance = initBal;
        name = owner;
        acctNum = num;
    }
    
    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = getNextNum();
        nextAcctNum++;
    }
    
    public Account(String owner)
    {
        balance = 0;
        name = owner;
        acctNum = getNextNum();
        nextAcctNum++;
    }
    
    public String toString(){
        return name + "'s account number is " + acctNum + ".  Balance is $" + balance + ".";
        
    }
    //----------------------------------------------
    //Checks to see if balance is sufficient for withdrawal.
    //If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from " + name + "'s account.  New balance is $" + balance + ".");
        } else
            System.out.println("Insufficient funds");
    }
    
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount + fee) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " plus $" + fee + " fee from " + name + "'s account.  New balance is $" + balance + ".");
        } else
            System.out.println("Insufficient funds");
    }
    //----------------------------------------------
    //Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }
    //----------------------------------------------
    //Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    //----------------------------------------------
    //Returns account name.
    //----------------------------------------------
    public String getName()
    {
        return name;
    }
}
