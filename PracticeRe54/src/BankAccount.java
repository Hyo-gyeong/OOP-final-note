import java.util.Random;
public class BankAccount {
	
	Random rn = new Random();

	private String name, accoutNo; 
	private int balance; 
	private double interest;
	
	public BankAccount() {
		this.name = "��";
		this.balance = 0;
		this.interest = 0;
	}
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.interest = 0;
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
	public void setAccoutNo(String b)
	{
		accoutNo = b; 
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
		return this.accoutNo;
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
		return r1+"-"+r2;
	}
	
	private int calcInterest() {
		return (int)calcInterest(balance, interest);
	}
	
	public String toString()   
	{
		return "�̸�: "+ name + "\n���¹�ȣ: " + makeID() 
				+ "\n�ܾ�: "+balance + "��\n������: " + interest+ "%\n����: " 
				+ calcInterest()+ "��";
	} 
	private double calcInterest(int balance, double interest)  
	{
		return balance * interest / 100;
	}

}