package NumberPrograms;

import java.util.Scanner;

public class SumofDigitalNumberAtEven {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int start=sc.nextInt();
		
		System.out.println("enter end number...");
		int end=sc.nextInt();
		int sum=0;
			for(int i=start;i<=end;i+=2)
			{
				sum=sum+i;
				//System.out.println(i);
			}
			System.out.println(sum);
	}

}
