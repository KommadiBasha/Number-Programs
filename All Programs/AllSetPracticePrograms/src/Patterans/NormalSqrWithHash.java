package Patterans;

import java.util.Scanner;

public class NormalSqrWithHash {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if((i==1 && j==1) || (i==2 && j==2)|| (i==3 && j==3)||( i==4 && j==4)||(i==5 &&j==5))
				{
					System.out.print("# ");
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
