package HardWork;

import java.util.Scanner;

public class Array1D_initialization {

	public static void main(String[] args) 
	{
		int [] usedForPrint=initilization();
		printelements(usedForPrint);
	
	}
	public static int[] initilization()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size...");
		int size=sc.nextInt();
		System.out.println("Enter elements...");
		int [] array=new int [size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static void printelements(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
