package SingleTonClass;

public class SingleTonDemo
{
	static int i=10;
	private static  SingleTonDemo s=null;
	
	private SingleTonDemo() 
	{
		
	}
	public static  SingleTonDemo  getSingleTonDemo( )
	{
		if(s==null)
		{
			s= new SingleTonDemo();
		}
		return s  ;
	}

	public static void main(String[] args) 
	{
		System.out.print("calling method ");
		System.out.println(getSingleTonDemo());
		
		SingleTonDemo x =new SingleTonDemo();
		System.out.println("Hashcode of x "+x.hashCode());
		SingleTonDemo y =new SingleTonDemo();
		System.out.println("Hashcode of y "+y.hashCode());
		SingleTonDemo z =new SingleTonDemo();
		System.out.println("Hashcode of z "+z.hashCode());
	
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		System.out.println(" calling after creating obj refference with method ");
		System.out.println(x.getSingleTonDemo());
		System.out.println(y.getSingleTonDemo());
		System.out.println(z.getSingleTonDemo());
		
	}


}
