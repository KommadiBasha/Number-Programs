package Patterans;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
