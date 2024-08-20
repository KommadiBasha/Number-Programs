package ArrayScanner_NumberPrograms;

import java.util.Scanner;

public class ProductNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length...");
		int len=sc.nextInt();
		
		int [] arr= new int[len];
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			prod*=arr[i];
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("......");
		System.out.println(prod);
	}
}
