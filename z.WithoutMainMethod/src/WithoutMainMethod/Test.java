package WithoutMainMethod;

public class Test 
{
	//To start a program execution compulsory we need main method from 1.7v on wards
	static int x=m();
	public static int m()
	{
		System.out.println("hello 1st way ");
		
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("test class");
	}
}
