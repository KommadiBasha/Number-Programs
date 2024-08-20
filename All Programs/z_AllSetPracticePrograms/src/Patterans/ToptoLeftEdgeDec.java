package Patterans;

import java.util.Scanner;

public class ToptoLeftEdgeDec {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row size...");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=row;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
