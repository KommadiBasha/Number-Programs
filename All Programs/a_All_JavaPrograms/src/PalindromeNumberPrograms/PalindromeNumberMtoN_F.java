package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeNumberMtoN_F 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m value...");
		int m=sc.nextInt();
		System.out.println("Enter n value...");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int sum=0;
			//Here we are removing so increment operator will not work
			for(int j=i;j>0;)
			{
				int last=j%10;
				sum =(sum*10)+last;
				j/=10;
				
			}
			if(sum==i)
			{
				System.out.print(sum+" ");
			}
		}

	}

}