package StringImmutable;

public final class StringVeriable
{
	private String user;
	
	public StringVeriable(String s) 
	{
		this.user=s;
	}
	public StringVeriable immutableUser(String s)
	{
		if(s==user)
		{
			return this;
		}
		else
		{
			return new StringVeriable(s);
		}
	}
	public static void main(String[] args) 
	{
		StringVeriable s1= new  StringVeriable("College");
		StringVeriable s2=s1.immutableUser("School");
		StringVeriable s3=s1.immutableUser("College");
		StringVeriable s4=s1.immutableUser("college");
		
		System.out.println(s1.equals(s3));//t
		System.out.println(s1.equals(s4));//f
		System.out.println(s1==s3);//t
		System.out.println(s1==s4);//f
		System.out.println("..........................");
		
		System.out.println(s4.equals(s3));//f
		System.out.println(s2.equals(s4));//f
		System.out.println(s1==s2);//f
		System.out.println(s3==s1);//t
		
	}

}
