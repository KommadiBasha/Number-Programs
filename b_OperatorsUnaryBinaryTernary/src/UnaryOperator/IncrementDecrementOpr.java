package UnaryOperator;



public class IncrementDecrementOpr 
{
	public static void main(String[] args)
	{
		int a=1;
		int b=5;
		int c=11;
		
		if(a==1)
		{
			//System.out.println(a);
			a=a+b;
			//a=a+3;
			
		}
		System.out.println(a);
		//System.out.println(a);
		
		c=b;
		--c;
		System.out.println(c);
		
		c=+c;
		System.out.println(c);
	}
}

