package Patterans;

import java.util.Scanner;

public class LeftOncesZeros {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		int num=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print((i+j)%2+" ");
				
			}
			System.out.println();
		}


	}

}
