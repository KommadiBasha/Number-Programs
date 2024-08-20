package MtoNPrintProgams;

import java.util.Scanner;

public class MtoNEvenandOddCount {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter start number...");
		int num1=sc.nextInt();
		System.out.println("enter end number...");
		int num2=sc.nextInt();
		int countE=0;
		int countO=0;
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				
				System.out.print(i+" ");
				countE++;
			}
			else
			{
				System.out.println();
				System.out.print(i+" ");
				countO++;
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println(countE);
		System.out.println(countO);
	}

}
