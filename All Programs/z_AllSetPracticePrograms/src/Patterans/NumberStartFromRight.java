package Patterans;

import java.util.Scanner;

public class NumberStartFromRight {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		int num=0;
		for(int i=1;i<=row;i++)
		{
			num+=i;
			int n=num;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n-- +" ");
			
			}
			System.out.println();
		}
	}

}
