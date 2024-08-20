package Patterans;

import java.util.Scanner;

public class PatteranPossition2_2Special {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==2 && j==2)
				{
					System.out.print("@ ");
				}
				else if(i==row-1 && j==row-1)
				{
					System.out.print("% ");
				}
				else
				{	
				System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
