import java.util.Random;
public class BankAccount {
	
	Random rn = new Random();

	private String name, accountNo; 
	private int balance; 
	private double interest;
	
	public BankAccount() {
		this("��", 0, 0);
	}
	public BankAccount(String name, int balance) {
		this(name, balance, 0);
	}
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	}

	public void setName(String a)
	{
		name = a; 
	}
	public void setAccountNo(String b)
	{
		accountNo = b; 
	}
	public void setBalance(int c)
	{
		balance = c; 
	}
	public void setRate(double d)
	{
		interest = d; 
	}
	
	public String getName() {
		return this.name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return this.balance;
	}
	public double getInterest() {
		return this.interest;
	}
	
	private String makeID() {
		int r1 = rn.nextInt(9000)+1000;
		int r2 = rn.nextInt(9000)+1000;
		setAccountNo(r1+"-"+r2);
		return accountNo;
	}
	
	public String toString()   
	{
		return makeID()+" :: "+getName()+" :: "+getBalance()+"�� :: "+getInterest()+"%";
	} 
	
	public boolean deposit(int money) {
		if (money < 0) {
			return false;
		}
		else {
			balance += money;
			return true;
		}
	}
	public boolean withdraw(int money) {
		if (money > balance) {
			return false;
		}
		else {
			balance -= money;
			return true;
		}
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if (from.withdraw(money) == true && to.deposit(money) == true) {
			return true;
		}
		else {
			return false;
		}
	}

}