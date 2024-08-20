package Patterans;

import java.util.Scanner;

public class NumbersContinue1to9t01 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(num==9)
				{
					System.out.print(num+" ");
					num=1;
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}

}
