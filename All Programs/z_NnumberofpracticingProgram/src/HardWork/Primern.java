package HardWork;

import java.util.Scanner;

public class Primern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number...");
		int enter = sc.nextInt();
		 for(int i=2;i<=enter ;i++)
		 {
			 if(enter%i==0)
			 {
				 if(i==enter)
				 {
				 System.out.println("prime");
				 break;
				 }
			 else
			 {
				 System.out.println("not a prime...");
				 break;
				 
			 }
			 }
		 }
	}

}
