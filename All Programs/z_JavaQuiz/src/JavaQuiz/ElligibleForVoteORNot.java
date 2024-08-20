package JavaQuiz;

import java.util.Scanner;

public class ElligibleForVoteORNot 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter person age....");
		
		int num=sc.nextInt();
		
		if(num >=18)
		{
			System.out.println("elligible for vote ");
		}
		else
		{
			System.out.println("not elligible ");
		}
		
	}
}
