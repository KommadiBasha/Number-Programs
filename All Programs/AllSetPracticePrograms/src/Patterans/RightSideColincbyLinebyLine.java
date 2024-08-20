package Patterans;

import java.util.Scanner;

public class RightSideColincbyLinebyLine {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row...");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=row;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("out of the loop");
	}

}
