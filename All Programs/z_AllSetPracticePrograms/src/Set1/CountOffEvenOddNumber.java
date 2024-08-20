package Set1;

import java.util.Scanner;

public class CountOffEvenOddNumber {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter start number...");
	int num1=sc.nextInt();
	System.out.println("Enter end number...");
	int num2=sc.nextInt();
	int countE=0,countO=0;
	for(int i=num1;i<=num2;i++)
	{
		if(i%2==0)
		{
			countE++;
		}
		else
		{
			countO++;
		}
		
	}
	
	System.out.print("Even count :"+ countE);
	System.out.println();
	System.out.print("Odd count :"+ countO);
	}

}
