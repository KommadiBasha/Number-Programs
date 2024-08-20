package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeMtoN_WF {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m value...");
		int m=sc.nextInt();
		System.out.println("Enter n value...");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int num=i;
			int sum=0;
			while(num>0)
			{
				int last=num%10;
				sum=sum*10+last;
				num/=10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}

	}

}
