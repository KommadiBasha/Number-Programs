package HardWork;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter num...");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("perfect num.");
		}
		else
		{
			System.out.println("not pefect...");
		}
	}

}
