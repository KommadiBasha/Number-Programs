package SingleTon_Class;

public class DemoForSingleTon 
{
	static DemoForSingleTon ref=null;
	private DemoForSingleTon() 
	{
		
	}
	public static DemoForSingleTon one()
	{
		if(ref==null)
		{
			ref=new DemoForSingleTon ();
		}
			return ref;
		
	}
	public static void main(String[] args) {
		System.out.println("already created  ."+DemoForSingleTon.one());
		
		DemoForSingleTon d1= DemoForSingleTon.one();
		DemoForSingleTon d2= DemoForSingleTon.one();
		System.out.println(d1+"  "+d2);
	}
}
