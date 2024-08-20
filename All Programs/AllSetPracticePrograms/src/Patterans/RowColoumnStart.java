package Patterans;

import java.util.Scanner;

public class RowColoumnStart {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter row size...");
	int row=sc.nextInt();
	System.out.println("Enter coloumn size. ");
	int col=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
