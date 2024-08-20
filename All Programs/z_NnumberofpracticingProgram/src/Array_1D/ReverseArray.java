package Array_1D;

import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter length...");
	int len=sc.nextInt();
	System.out.println("enter array values...");
	int arr []=new int [len];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("--------------------------------------------");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
}
