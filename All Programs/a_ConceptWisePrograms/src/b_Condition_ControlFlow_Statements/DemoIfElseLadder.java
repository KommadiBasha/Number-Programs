package b_Condition_ControlFlow_Statements;

public class DemoIfElseLadder 
{

	public static void main(String[] args) 
	{
		int a=100,b=20,c=550,d=40;
		if(a>b && a>c && a>d)
		{
			System.out.println("a is greater");
		}
		else if (b>a && b>c && b>d )
		{
			System.out.println("b is greater");
		}
		else if (c>a && c>b && c>d)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}

	}

}
