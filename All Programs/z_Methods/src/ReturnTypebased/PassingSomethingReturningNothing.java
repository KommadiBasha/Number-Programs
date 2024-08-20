package ReturnTypebased;

public class PassingSomethingReturningNothing {

	
	public static void method(int i,String s)
	{
		System.out.println("method");
		System.out.println(i +" "+ s);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		method(9,"Name");
	}

}
