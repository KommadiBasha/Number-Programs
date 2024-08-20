package Array_1D;

import java.util.Scanner;

public class ScannerClassIntialization {

	public static void main(String[] args) 
	{
	
	int [] i= arrayinitialization();
	printarr(i);
	}
	public static int[] arrayinitialization()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size....");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter values....");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void printarr(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}
