package NumberPrograms;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number............ .");
	int num=sc.nextInt();
	int sum=0;
	while(num>0)
	{
		int last=num%10;
		sum=sum*10+last;
		num/=10;
	}
	System.out.println(sum);
	}

}
