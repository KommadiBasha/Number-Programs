package HardWork;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number.");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			int square=i*i;
			if(square==num)
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
				System.out.println("not a perfect square");
				break;
			}
			
			
		}
		
	}

}
