package NumberPrograms;

import java.util.Scanner;

public class ArmstrongProgram {
	
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a number...");
	
	int num=sc.nextInt();
	int num1=num;
	int num2=num1;
	int count=0;
	int sum=0;
	while(num>0)
	{
		count++;
		num/=10;
	}
	while(num1>0)
	{
		int fact=1;
		int last=num1%10;
		for(int i=1;i<=count;i++)
		{
			
			fact=fact*last;
		}
		num1/=10;
		sum=sum+fact;
		
	}
	System.out.println("armstrong " + sum +"  " +num2);
	if(sum==num2)
	{
		System.out.println("armstrong " + sum +"  " +num2);
	}
	else
	System.out.print("not a armstrong...");
}
}
