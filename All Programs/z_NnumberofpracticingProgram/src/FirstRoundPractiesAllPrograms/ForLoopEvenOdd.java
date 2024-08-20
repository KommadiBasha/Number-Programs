package FirstRoundPractiesAllPrograms;

import java.util.Scanner;

public class ForLoopEvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("for loop start value");
		int start=sc.nextInt();
		
		System.out.println("for loop end value");
		int end=sc.nextInt();
		for(int i=start;i<=end;i+=2)
		{
			System.out.print(i+" ");
		}

	}

}
