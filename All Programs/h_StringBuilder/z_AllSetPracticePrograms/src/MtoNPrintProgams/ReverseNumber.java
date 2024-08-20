package MtoNPrintProgams;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("You are printing whole numbers ok...");
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		
		
			while(m!=0)
			{
			int last=m%10;
			System.out.print(last+" ");
			m=m/10;
			}
			//System.out.print(i+" ");
		

	}

}
