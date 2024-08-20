package SingleTon;

public class SingleTonClass
{

	static SingleTonClass s;
	private SingleTonClass()
	{
	
	}
	public static SingleTonClass changing()
	{
		if(s==null)
		{
			s = new SingleTonClass();
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(s.changing());
		
		SingleTonClass s1= new SingleTonClass();
		SingleTonClass s2= new SingleTonClass();
		
		System.out.println(s1);
		
		System.out.println(s1.changing());
		System.out.println(s2.changing());
	}
	
}
