package HardWork;

import java.util.Arrays;
import java.util.Scanner;

public class Find2ndLargestNumberinArr {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size...");
		int size=sc.nextInt();
		System.out.println("enter values...");
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.print("before sorting... :");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("after soring..." );
		for(int i=0;i<arr.length;i++)
		{
			Arrays.sort(arr);
			arr.toString();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int count=0;
		int store=0;
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
			count++;
			if(count==count)
			{
				store=1;
			}
		}
		System.out.println();
		System.out.println(store);
		System.out.println("count is"+count);
	}

}
