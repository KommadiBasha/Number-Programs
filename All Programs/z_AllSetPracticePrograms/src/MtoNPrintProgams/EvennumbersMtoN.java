package MtoNPrintProgams;

import java.util.Scanner;

public class EvennumbersMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("You are printing even and odd based on input numbers ok...");
		System.out.println("enter the start number...");
		int start=sc.nextInt();
		System.out.println("Enter end Number...");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i+=2)
		{
			System.out.print(i+" ");
		}

	}

}
