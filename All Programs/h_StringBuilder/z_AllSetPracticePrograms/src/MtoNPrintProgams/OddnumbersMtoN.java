package MtoNPrintProgams;

import java.util.Scanner;

public class OddnumbersMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("You are printing whole numbers ok...");
		System.out.println("enter the start number...");
		int start=sc.nextInt();
		System.out.println("Enter end Number...");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==1)
			{
			System.out.print(i+" ");
			}else
			{
				System.out.println("   "+ i+" ");
			}
		}

	}

}
