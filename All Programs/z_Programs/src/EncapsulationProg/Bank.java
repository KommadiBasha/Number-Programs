package EncapsulationProg;

public class Bank 
{
	private double balance;
	
	public Bank() 
	{
		super();
	}
	public Bank(double balance) 
	{
		super();
		this.balance = balance;
	}
	
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}	
	public double getBalance()
	{
		return balance;
	}
}
//public class MainDriver {
//
//	public static void main(String[] args) 
//	{
//		Bank b= new Bank();
//		b.setBalance(199.00);
//		
//		System.out.println(b.getBalance());
//	}
//}
