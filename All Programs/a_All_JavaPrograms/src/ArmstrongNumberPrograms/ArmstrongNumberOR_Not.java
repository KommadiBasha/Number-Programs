package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberOR_Not {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int extra=num;
		int check=num;
		int count=0;
		int sum=0;
		boolean b=false;
	
		for(int i=1;num>0;i++)
		{
			count++;
			num/=10;
		}
			while(extra>0)
			{
				int last=extra%10;
				int fact=1;
				for(int j=1;j<=count;j++)
				{
					fact=fact*last;	
				}
				sum=sum+fact;
				extra/=10;
			}
			if(sum==check)
			{
				b=true;
			}
		if(b==true)
		{
			System.out.println("Armstrong number...");
		}
		else
		{
			System.out.println("Not armStrong number");
		}
		System.out.println(count+" count...");
	}

}
