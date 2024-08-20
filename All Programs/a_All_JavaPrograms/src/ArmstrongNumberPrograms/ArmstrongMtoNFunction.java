package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongMtoNFunction 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number");
		int start=sc.nextInt();
		
		System.out.println("enter end number");
		int end=sc.nextInt();
		mtonArmstrongNum(start, end);
	}
	public static void mtonArmstrongNum(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			int countDigits=i;
			int count=0;
			while(countDigits>0)
			{
				count++;
				countDigits/=10;
			}
			int remNumber=i;
			int sum=0;
			while(remNumber>0)
			{
				int rem=remNumber%10;
				int fact=1;
				for(int j=1;j<=count;j++)
				{
					fact=fact*rem;
				}
				sum+=fact;
				remNumber/=10;
			}
			if(i==sum)
			{
				System.out.print(i+" ");
			}
		}
	}	

}
