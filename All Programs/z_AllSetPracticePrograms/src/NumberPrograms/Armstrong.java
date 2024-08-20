package NumberPrograms;

import java.util.Scanner;

public class Armstrong {
 
	public static void main(String [] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter number...");
	 int originalNum=sc.nextInt();
	 int num=originalNum;
	 int num1=originalNum;
	 
	 int count=0;
	 int sum=0;
	 while(num!=0)
	 {
			count++;
		 num/=10;
	 }
	 while(num1!=0)
	 {
		 int fact=1;
		 int last=num1%10;
		 for(int i=1;i<=count;i++)
		 {
			 fact=fact*last;
		 }
		 sum+=fact;
		 num1/=10;
	 }
	if(sum==originalNum)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not armstromg");
	}
	}
}
