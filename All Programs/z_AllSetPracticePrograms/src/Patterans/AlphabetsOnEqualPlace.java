package Patterans;

import java.util.Scanner;

public class AlphabetsOnEqualPlace {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		char c='A';
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==j)
				{
					System.out.print(c+" ");
					c++;
				}
				else if(i==1 || i==row || j==1 ||j==row)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
