package Encapsulation;

public class EncapsulationPro 
{
	private int sayNumber;
	private String sayName;
	
	public void setSayNumber(int say)
	{
		this.sayNumber=say;
	}
	public void setSayName(String name)
	{
		this.sayName=name;
	}
	public int getSayNumber()
	{
		return sayNumber;
	}
	public String getSayName()
	{
		return sayName;
	}
 public static void main(String[] args) {
	 EncapsulationPro  e= new EncapsulationPro ();
	 e.setSayName("Sani");
	 e.setSayNumber(2022);
	 System.out.println(e.getSayName());
	 System.out.println(e.getSayNumber());
}
}
