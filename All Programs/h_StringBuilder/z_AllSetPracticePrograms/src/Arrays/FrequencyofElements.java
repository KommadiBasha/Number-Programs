package Arrays;

import java.util.Scanner;

public class FrequencyofElements {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size ");
		int size=sc.nextInt();
		System.out.println("elements");
		int [] arr= new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j] && arr[i]!=0 && arr[j]!=0)
					{
						arr[j]=0;
						count++;
					}
				}
				System.out.println(arr[i]+" is occured      :  "+count);
			}
		}

	}

}
