package NumberPrograms;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number...");
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			count++;
			number/=10;
		}
		System.out.println();
		System.out.println(count);
	}

}
