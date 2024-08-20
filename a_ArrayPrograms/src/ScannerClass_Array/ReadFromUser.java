package ScannerClass_Array;

import java.util.Scanner;

public class ReadFromUser 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of an array...");
		int len=sc.nextInt();
		
		int [] array= new int[len];
		System.out.println("Enter elements...");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i:array)
		{
			System.out.println(i);
		}
		
	}
}
