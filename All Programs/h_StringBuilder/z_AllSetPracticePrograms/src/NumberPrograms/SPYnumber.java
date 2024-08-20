package NumberPrograms;

import java.util.Scanner;

public class SPYnumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		int last=0;
		int product=1;
		int sum=0;
		while(start>0)
		{
			last=start%10;
			
			product=product*last;
			
			sum=sum+last;
			
			start/=10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(product==sum)
		{
			System.out.println("spy");
		}
		else
		{
			System.out.println("not spy...");
		}

	}

}
