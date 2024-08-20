package Encapsulation;
//Encapsulation program................................
public class Demo 
{
	private int vechileNum;
	private String vechileOwner;
	
	
	public Demo(int vechileNum, String vechileOwner) 
	{
		super();
		this.vechileNum = vechileNum;
		this.vechileOwner = vechileOwner;
	}
	public String toString()
	{
		return vechileOwner+" "+vechileNum;
	}
	public static void main(String[] args) 
	{
		Demo d1= new Demo(2229,"Sani");
		System.out.println(d1);
	}
	
}
