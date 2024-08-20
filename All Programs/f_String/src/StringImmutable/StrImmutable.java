package StringImmutable;

public final class StrImmutable {
	private String sayhi;
	
	public  StrImmutable(String str)
	{
		this.sayhi=str;
	}
	public  StrImmutable modify(String s)
	{
		if(sayhi==s)
		{
			return this;
		}
		else
		{
			return (new StrImmutable(s));
		}
		
	}
	public static void main(String[] args) {
		StrImmutable s1= new StrImmutable("sayhi");
		StrImmutable s2=new StrImmutable("sayhi");
		StrImmutable s3=new StrImmutable("sayhibye");
		s2.modify("sayhi");
		s3.modify("saybyehi");
		System.out.println(s1.equals(s2));
		System.out.println("--------------------");
		s2=s1.modify("sayhi");
		System.out.println(s1.equals(s2));
		
	}

}
