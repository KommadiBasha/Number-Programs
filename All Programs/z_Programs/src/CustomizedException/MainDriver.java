package CustomizedException;

public class MainDriver 
{

	public static void main(String[] args)
	{
		System.out.println("main...");
		m1();
	}
	public static void  m1() throws DemoCustomizedException
	{
		throw new DemoCustomizedException("My Own exception ");
	}
	public static void  m2()
	{
		
	}

}
