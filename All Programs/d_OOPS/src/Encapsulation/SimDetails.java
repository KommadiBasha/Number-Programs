package Encapsulation;

public class SimDetails 
{
	private String name;
	private long number;
	
	public void setName(String s, long l)
	{
		this.name=s;
		this.number=l;
	}
	public String getName()
	{
		return name;
	}
	public long getNumber()
	{
		return number;
	}
	public static void main(String[] args) {
		SimDetails s= new SimDetails ();
		s.setName("Sohil", 9985270826l);
		
		System.out.println(s.getName()+" "+s.getNumber());
	}
}
