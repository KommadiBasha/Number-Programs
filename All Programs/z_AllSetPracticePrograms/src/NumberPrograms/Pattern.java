package NumberPrograms;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number ");
		int start= sc.nextInt();
		System.out.println("enter end number ");
		int end=sc.nextInt();
		for(int i=1;i<=start;i++)
		{
			for(int j=i;j<=end;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
