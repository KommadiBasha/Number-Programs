package Inheritance_Multilevel;

public class ThirdClass extends SecondClass
{
	static int rollnumber=3;
	String name="ThirdClass";
	
	public String thirdNonStatic()
	{
		System.out.println("third nonstatic method....3");
		return name;
	}
	public static void thirdStatic()
	{
		System.out.println(rollnumber);
		System.out.println("third static method....3");
	}
}
