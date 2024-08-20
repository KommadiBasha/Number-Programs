package RealTimePraticedPrograms;

import java.util.Scanner;

public class CheckWhetherPersonElligibleforVoteor_Not {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num...");
		int num=sc.nextInt();
		
		if(num>=18 && num<=100)
		{
			System.out.println("Elligible for vote choose best party");
		}
		else if(num<=18)
		{
			System.out.println("He/She is mineer b'z there bellow 18 yeras... ");
		}

	}

}
