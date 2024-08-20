package Set2;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Start number .");
		int num=sc.nextInt();
		int a=1;
		int b=0;
		while(a<num)
		{
			if(a*a==num)
			{
				b=1;
			}
			a++;
		}
		if(b==1)
		{
			System.out.println("perfect square.");
		}
		else
		{
			System.out.println("Not a perfect sqare");
		}
		
	}

}
