package ReturnTypebased;

public class PassingSomethingReturningSomething {

	public static int method(int i,String s)
	{
		System.out.println("method");
		System.out.println(i +" "+ s);
		return 404;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		
		System.out.println(method(9,"Name"));
	}

}
