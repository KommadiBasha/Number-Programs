package Exam6442sum_P;

import java.util.Scanner;

public class SumOfNumberandPrintingP {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int last =num%10;
			num/=10;
			sum +=last;
			
			
		}
		
		if(1<=sum || sum<=26)
		{
			char c='A';
			for(int i=1;i<=26;i++)
			{
				if(i==sum)
				{
					System.out.println(c);
				}
				c++;
			}
		}
	}

}
