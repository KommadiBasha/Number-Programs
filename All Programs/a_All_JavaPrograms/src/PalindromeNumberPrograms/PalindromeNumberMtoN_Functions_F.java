package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeNumberMtoN_Functions_F 
{

	public static void palindomeOR_NOT(int receivingStart,int receivingEnd)
	{
		for(int i=receivingStart;i<=receivingEnd;i++)
		{
			int sum=0;
			for(int j=i;j>0;)
			{
				int last=j%10;
				sum=sum*10+last;
				j/=10;
			}
			if(i==sum)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter start number...");
		int start=sc.nextInt();
		
		System.out.println("Enter end number...");
		int end=sc.nextInt();
		
		
		palindomeOR_NOT(start, end);
	}

	

}
