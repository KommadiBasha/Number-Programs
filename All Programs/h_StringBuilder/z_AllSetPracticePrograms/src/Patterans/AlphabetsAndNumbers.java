package Patterans;

import java.util.Scanner;

public class AlphabetsAndNumbers {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		char c ='a';
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i%2==1)
				{
					System.out.print(c+" ");
					c++;
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}

}
