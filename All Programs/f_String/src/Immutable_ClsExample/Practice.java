package Immutable_ClsExample;

public final class Practice 
{
	//class level modifer ok 
	private int i;
	
	Practice (int conNum)
	{
		this.i=conNum;
	}
	public Practice modifyMethod(int numModify)
	{
		if( i==numModify)
		{
			return this;
		}
		else
		{
			return (new Practice (numModify));
		}
	}
	
	public static void main(String[] args) 
	{
		Practice  p1= new Practice (100);
		
		Practice p2= p1.modifyMethod(200);
		Practice p3=p1.modifyMethod(100);
		
		System.out.println(p1==p2);
		System.out.println(p2==p3);
		System.out.println(p1==p3);

	}

}
