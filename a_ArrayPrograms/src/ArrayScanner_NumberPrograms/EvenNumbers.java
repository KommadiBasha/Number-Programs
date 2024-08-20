package ArrayScanner_NumberPrograms;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Start number");
	int start=sc.nextInt();
	System.out.println("End number");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}

	}

}
