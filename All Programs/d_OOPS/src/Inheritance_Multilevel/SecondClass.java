package Inheritance_Multilevel;

public class SecondClass extends FirstClass
{
	static int rollnumber=2;
	String name="SecondClass";
	
	public String secondNonStatic()
	{
		System.out.println("second nonstatic method....2");
		return name;
	}
	public static void secondStatic()
	{
		System.out.println(rollnumber);
		System.out.println("second static method....2");
	}
}
