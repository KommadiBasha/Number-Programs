package Immutable_ClsExample;

public final class Test 
{
	private int i;
	Test(int i)
	{
		this.i=i;
	}
	public Test modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return (new Test(i));
		}
	}
	public static void main(String[] args) 
	{
		Test  t= new Test(10);
		System.out.println(t);
		Test  t1= t.modify(99);
		Test  t2= t.modify(10);
		
		System.out.println(t==t1);
		//in methods we are testing..
		System.out.println(t==t2);
		System.out.println(t1==t2);

	}

}
