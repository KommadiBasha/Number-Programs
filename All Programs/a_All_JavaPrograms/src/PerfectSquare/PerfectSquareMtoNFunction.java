package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareMtoNFunction {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter m number");
		int m=sc.nextInt();
		System.out.println("enter n number");
		int n=sc.nextInt();
		
		perfectSquareMtoN(m, n);
	}
	public static void perfectSquareMtoN(int k,int l )
	{
	
		for(int i=k;i<=l;i++)
		{
			int temp=i;
			int num=1;
			
			while(num<i)
			{
				int square=num*num;
				num++;	
			
				if(temp==square)
				{
					System.out.print(temp+" ");
				}
			}
			
		}
	}

}
