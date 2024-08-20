package Encapsulation;

public class DemoProgram 
{
	private double balance;
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args) 
	{
		DemoProgram d= new DemoProgram();
		d.setBalance(12.20);
		System.out.println(d.getBalance());
		    
	}

}
