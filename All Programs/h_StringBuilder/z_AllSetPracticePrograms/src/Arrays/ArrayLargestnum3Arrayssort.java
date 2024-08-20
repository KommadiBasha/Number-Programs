package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestnum3Arrayssort {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int [] arr= new int[size];
		System.out.println("enter values ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
			count++;
			}
		}
		System.out.print("count :"+count +"   length"+arr.length);
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=0 && arr[j]!=0)
				{
					arr[j]=0;
				}
			}
		}
		Arrays.sort(arr);
		arr.toString();
		int [] duplicate = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				duplicate[k++] = duplicate[i];
			}
		}
		if(arr.length>2)
		{
			System.out.println("3rd largest :"+arr[arr.length-3]);
		}
		else
		{
			System.out.println("no number...");
		}
		
	}

}
