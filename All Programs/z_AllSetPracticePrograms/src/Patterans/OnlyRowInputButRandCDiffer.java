package Patterans;

import java.util.Scanner;

public class OnlyRowInputButRandCDiffer {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row size...");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row/2+1;j++)
			{
				
					System.out.print(" * ");
				
			}
			System.out.println();
		}
	}

}
