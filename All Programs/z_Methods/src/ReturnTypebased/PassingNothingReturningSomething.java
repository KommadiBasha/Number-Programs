package ReturnTypebased;

public class PassingNothingReturningSomething {

	public static double method()
	{
		System.out.println("method");
		return 5.3;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		//method();
		System.out.println(method());
	}

}
