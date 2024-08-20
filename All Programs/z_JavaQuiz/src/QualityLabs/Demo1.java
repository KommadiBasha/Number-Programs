package QualityLabs;

public class Demo1 {

	private Demo1(int d)
	{
		System.out.println("con");
	}
	
	protected static Demo1 c(int d)
	{
		Demo1 obj=new Demo1(d);
		return obj;
	}
	public void my()
	{
		System.out.println("my");
	}

}
