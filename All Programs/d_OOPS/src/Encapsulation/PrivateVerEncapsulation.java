package Encapsulation;

public class PrivateVerEncapsulation {
	private long bank_acc;

	public long getBank_acc() 
	{
		return bank_acc;
	}

	public void setBank_acc(long bank_acc) 
	{
		this.bank_acc = bank_acc;
	}

	public static void main(String[] args) 
	{
		PrivateVerEncapsulation p = new PrivateVerEncapsulation();
		p.setBank_acc(35291439364l);
		System.out.println(p.getBank_acc());

	}
}
