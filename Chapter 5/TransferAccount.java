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
    
    /**
     * Transfers money from one account to another
     *
     * @param acct account to transfer money from
     * @param acct2 account to transfer money to
     * @param amount amount of money to be transferred
     */
    public static void transfer(Account acct, Account acct2, double amount) {
        acct.transfer(acct2, amount);
    }
    
    /**
     * Transfers a specified amount of money to another account
     * 
     * @param acct Account to transfer money to
     * @param amount amount of money to transfer
     */
    public void transfer(Account acct, double amount) {
        this.withdraw(amount);
        acct.deposit(amount);
        System.out.println("Transferred " + amount + " from " + name + "'s account to " + acct.getName() + "'s account."); 
    }
    
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
            System.out.println("Withdraw $" + amount + " from " + name + "'s account.  New balance is $" + balance + ".");
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
            System.out.println("Withdraw $" + amount + " plus $" + fee + " fee from " + name + "'s account.  New balance is $" + balance + ".");
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
