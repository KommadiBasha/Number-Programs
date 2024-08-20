package CustomizedException;

public class DemoCustomizedException extends RuntimeException
{
	DemoCustomizedException (String s)
	{
		System.out.println(s);
	}
}
