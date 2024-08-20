package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareOR_NOT_W {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		boolean b= false;
		int i=1;
		while(i<num)
		{
			int square=i*i;
			if(square==num)
			{
				b=true;
				break;
			}
			i++;
		}
		if(b==true)
			System.out.println("perfect square...");
		else
			System.out.println("not a perfect square...");
		
	}

}
