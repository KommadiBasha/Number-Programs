package StringImmutable;

public final class StringImmuatable 
{
	private String name;
	
	public StringImmuatable(String s) 
	{
	this.name=s;
	}
	
	public StringImmuatable modify(String str)
	{
		if(name==str)
		{
			return this;
		}
		else
		{
			return (new StringImmuatable(str));
		}
	}
	public static void main(String[] args) 
	{
		StringImmuatable s1= new StringImmuatable("Sani");
		
		StringImmuatable s2= s1.modify("Sani");
		StringImmuatable s3= s1.modify("Sohil");
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s1);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println("......................");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}
