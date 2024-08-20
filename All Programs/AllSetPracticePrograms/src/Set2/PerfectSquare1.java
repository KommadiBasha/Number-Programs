package Set2;

import java.util.Scanner;

public class PerfectSquare1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Start number .");
		int a=sc.nextInt();
		boolean flag=false;
		while(a>0)
		{
			int square=a*a;
			if(square==a)
			{
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("perfect square");
				break;
			}
			else
			{
				System.out.println("not a perfect square.");
				break;
			}
		}
		
	}

}
