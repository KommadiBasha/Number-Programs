package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargest2NumArrayssort {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size...");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter elements...");
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
		//System.out.println(count);
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
		int [] a=new int[arr.length-count];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				a[k++]=a[i];
			}
		
		if(arr.length>1)
		{
			System.out.println("Second largest num :"+arr[arr.length-2]);
			break;
		}
		else
		{
			System.out.println("no largest number...");
			break;
		}
		}
	}

}
