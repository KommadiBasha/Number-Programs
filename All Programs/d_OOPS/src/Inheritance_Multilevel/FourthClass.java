package Inheritance_Multilevel;

public class FourthClass extends ThirdClass
{
	static int rollnumber=4;
	String name="FourthClass";
	
	public String fourthNonStatic()
	{
		System.out.println("fourth nonstatic method....1");
		return name;
	}
	public static void fourthStatic()
	{
		System.out.println(rollnumber);
		System.out.println("fourth static method....1");
	}
}
