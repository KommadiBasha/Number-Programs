package EncapsulationProg;

public class MainDriver {

	public static void main(String[] args) 
	{
		Bank b= new Bank(99.0);
		b.setBalance(399.00);
		Bank b1= new Bank(199.0);
		Bank b2= new Bank(299.0);
		System.out.println(b.getBalance());
		System.out.println(b1.getBalance());
		System.out.println(b2.getBalance());
	}

}
