package SingleTon_Class;

public class CreateSingleTon 
{
	static CreateSingleTon c;
	
	private CreateSingleTon()
	{
		
	}
	public CreateSingleTon creatingOb()
	{
		if(c==null)
		{
			c=new CreateSingleTon();
		}
		return c;
	}
	public static void main(String[] args) {
		
		
		CreateSingleTon c1= new CreateSingleTon();
		System.out.println(c1.creatingOb());
		CreateSingleTon c2= new CreateSingleTon();
		CreateSingleTon c3= new CreateSingleTon();
		
		System.out.println(c2.creatingOb());
		System.out.println(c3.creatingOb());
	
	}
}
