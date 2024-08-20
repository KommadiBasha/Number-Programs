package HardWork;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int num1=num;
		int org=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		while(num1>0)
		{
			int last=num1%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*last;
			}
			sum=sum+pow;
			num1/=10;
		}
			if(sum==org)
			{
				System.out.println("armstrong");
			}
			else
			{
				System.out.println("not a armstrong ");
			}
		
	}

}
