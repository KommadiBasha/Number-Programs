package MtoNPrintProgams;

import java.util.Scanner;

public class FactorialMtoN {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int start=sc.nextInt();
		
		System.out.println("enter end number...");
		int end=sc.nextInt();
		
			for(int i=start;i<=end;i++)
			{
				int fact=1;
				int temp=i;
				for(int j=1;j<=temp;j++)
				{
					fact=fact*j;
				}
				System.out.println(fact);
				//System.out.println("one time inner loop cmt");
			}
			
	}

}
