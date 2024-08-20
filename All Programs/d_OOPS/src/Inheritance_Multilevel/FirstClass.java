package Inheritance_Multilevel;

public class FirstClass 
{
	static int rollnumber=1;
	String name="FirstClass";
	
	public String fristNonStatic()
	{
		System.out.println("first nonstatic method....1");
		return name;
	}
	public static void firstStatic()
	{
		System.out.println(rollnumber);
		System.out.println("first static method....1");
	}
	
}
