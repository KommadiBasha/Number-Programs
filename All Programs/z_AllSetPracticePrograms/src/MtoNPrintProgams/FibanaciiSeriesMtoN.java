package MtoNPrintProgams;

import java.util.Scanner;
//Pending.........................................................................
public class FibanaciiSeriesMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		
		for(int i= m ; i<=n; i++)
		{
			int c=0;
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");
				c = m + j;
				m=j;
				j=m;
				
			}
			
		}

	}

}
