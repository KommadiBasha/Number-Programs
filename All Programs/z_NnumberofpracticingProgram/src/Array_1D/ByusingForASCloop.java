package Array_1D;

import java.util.Scanner;

public class ByusingForASCloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int len=sc.nextInt();
		int [] arr=new int[len];
		System.out.println("enter values");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
