package Set1;

import java.util.Scanner;

public class OddNumberBetweenMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter start number...");
		int i =sc.nextInt();
		System.out.println("Enter end number...");
		int j=sc.nextInt();
		while(i<=j)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
			
			i++;
		}
	}

}
