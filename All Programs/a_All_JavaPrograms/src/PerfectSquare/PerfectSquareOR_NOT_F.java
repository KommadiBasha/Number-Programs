package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareOR_NOT_F {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	boolean b= false;
	for(int i=1;i<=num;i++)
	{
		int square=i*i;
		if(square==num)
		{
			b=true;
			break;
		}
	}
	if(b==true)
		System.out.println("perfect square...");
	else
		System.out.println("not a perfect square...");
	}

}
