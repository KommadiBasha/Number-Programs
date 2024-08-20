package Arrays;

import java.util.Scanner;

public class ArrayInReverseOrder {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size ");
	int  size=sc.nextInt();
	System.out.println("enter values");
	int [] arr= new int [size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	}

}
