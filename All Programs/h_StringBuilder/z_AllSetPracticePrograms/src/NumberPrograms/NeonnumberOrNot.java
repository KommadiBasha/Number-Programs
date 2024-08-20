package NumberPrograms;

import java.util.Scanner;

public class NeonnumberOrNot {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner (System.in);
		System.out.println("enter num...");
		int num=sc.nextInt();
		int product=1;
		int sum=0;
		for(int i=1;i<=2;i++)
		{
		
			product=product*num;
		}
		System.out.println(product);
		while(product>0)
		{
			int last=product%10;
			sum=sum+last;
			product/=10;
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("neon...");
		}
		else
		{
			System.out.println("not neon...");
		}
	}

}
