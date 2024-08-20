package MtoNPrintProgams;

import java.util.Scanner;

public class SPYNumbers_MtoN {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int start=sc.nextInt();
		
		System.out.println("enter end number...");
		int end=sc.nextInt();
		

	
		
			for(int i=start;i<=end;i++)
			{
				int last=0;
				int product=1;
				int sum=0;
				int temp=i;
				while(temp>0)
				{
					last=temp%10;
					sum+=last;
					product*=last;
					temp/=10;
				}
				if(sum==product)
				{
					System.out.println(i);
				}
				
				
				
			}
				
			
			
			
			
			
		
		
	}

}
