package SingleTon_Class;

public class SingleTon {

	static SingleTon instent;
	
	private SingleTon()
	{
		
	}
	public static SingleTon getInstance()
	{
		if(instent==null)
		{
			instent=new SingleTon();
		}
		return instent;
	}
	public static void main(String[] args) {
		
		SingleTon s1=new SingleTon();
		SingleTon s2= new SingleTon();
		SingleTon s3= new  SingleTon();
		
		System.out.println(s1.getInstance());
		System.out.println(s2.getInstance());
		System.out.println(s2.getInstance());
		System.out.println("---------------");
		
	}

}
