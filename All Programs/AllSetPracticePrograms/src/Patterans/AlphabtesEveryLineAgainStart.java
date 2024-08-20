package Patterans;

import java.util.Scanner;

public class AlphabtesEveryLineAgainStart {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
			char c='a';
			for(int j=1;j<=i;j++)
			{
				 System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}

}
