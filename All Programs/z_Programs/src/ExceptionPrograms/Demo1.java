package ExceptionPrograms;

public class Demo1 {

	public static void main(String[] args) 
	{
		System.out.println("main method...");
		m1();
	}
	public static void m1() 
	{
		try
		{
		System.out.print(10/0);
		System.out.println(10/5);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
	}
}
