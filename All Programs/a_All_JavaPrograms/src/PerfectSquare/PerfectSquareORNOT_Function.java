package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareORNOT_Function {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		boolean flag=perfectNumber(num, false);
		if(flag==true)
			System.out.println("perfect square..");
		else
		System.out.println("not a perfect square");
	}
	public static boolean perfectNumber(int n,boolean b)
	{
		boolean b1=b;
		for(int i=1;i<=n;i++)
		{
			int square=i*i;
			if(n==square)
			{
				b1=true;
			}	
		}
		return b1 ;
	}
}
