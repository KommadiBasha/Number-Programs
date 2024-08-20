package MtoNPrintProgams;

import java.util.Scanner;

public class PalindromeMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int rev=0;
			for(int j=i;j>0;j/=10)
			{
				int last=j%10;
				rev=(rev*10)+last;
			}
			if(rev==i)
			{
				System.out.print(rev+" ");
			}
			
		}
	
	}

}
