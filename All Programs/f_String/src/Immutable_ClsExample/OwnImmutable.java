package Immutable_ClsExample;

public final class OwnImmutable
{
	private int i;
	OwnImmutable(int x)
	{
		this.i=x;
	}
	public OwnImmutable modify(int k)
	{
		if(this.i==k)
		{
			return this;
		}
		else
		{
		return (new OwnImmutable(i));
		}
	}
	public static void main(String[] args) {
		OwnImmutable o1 =new OwnImmutable(11);
		
		System.out.println(o1);
		OwnImmutable o2 =o1.modify(91);
		OwnImmutable o3 =o1.modify(11);
		
		System.out.println(o1==o2);
		System.out.println(o1==o3);
		
	}
	
	
	
	
}
