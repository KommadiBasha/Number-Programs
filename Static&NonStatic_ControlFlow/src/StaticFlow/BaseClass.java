package StaticFlow;

public class BaseClass 
{
	static String s="Sani";
	
	static
	{
		
		System.out.println("First Statement in the program");
		System.out.println(s);
		
	}
	static int number=1999;
	
	public static void main(String[] args) 
	{
		System.out.println("Output in main method first statement...");
		//System.out.println(s);
	}
	
	
}
