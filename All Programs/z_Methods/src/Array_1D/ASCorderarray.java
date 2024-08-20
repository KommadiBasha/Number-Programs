package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class ASCorderarray {

	public static void main(String[] args) 
	{
		int [] sendingfromhere=ascorderinitialization();
		print(sendingfromhere);
		
		

	}
	public static int[] ascorderinitialization()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size...");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter values");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void print(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			Arrays.sort(a);
			a.toString();
			System.out.println(a[i]);
		}
		
	}
}
