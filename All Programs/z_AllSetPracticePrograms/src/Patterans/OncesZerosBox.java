package Patterans;

import java.util.Scanner;

public class OncesZerosBox {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a row");
		int row=sc.nextInt();
		int num=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if((i+j)%2==1)
				{	
				System.out.print(1+" ");
				}
				
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
