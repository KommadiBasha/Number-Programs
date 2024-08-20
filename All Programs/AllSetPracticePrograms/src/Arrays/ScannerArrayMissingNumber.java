package Arrays;

import java.util.Scanner;

public class ScannerArrayMissingNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter values...");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int totalsize = size*(size+1)/2;
		int actualsum=0;
		int store=0;
		for(int i=0;i<arr.length-1;i++)
		{
			actualsum =actualsum+arr[i];
			store=totalsize-actualsum;
		
		}
		System.out.println(store);
		

	}

}
