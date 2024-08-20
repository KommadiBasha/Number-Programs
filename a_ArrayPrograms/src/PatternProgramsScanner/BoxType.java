package PatternProgramsScanner;

import java.util.Scanner;

public class BoxType {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size...");
		int row= sc.nextInt();
		System.out.println("Enter column number");
		int coloum=sc.nextInt();
		
		int [] x=new int[row];
		int [] y= new int[coloum];
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=coloum;j++)
			{
				if(i==j)
				{
				System.out.print(" * ");
				}
				
			}
			System.out.println();
		}
	}

}
