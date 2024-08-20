package NumberArray;

import java.util.Arrays;

public class ArraySortingAscendingOrder {

	public static void main(String[] args) 
	{
		int [] arr= {10,30,4,43,2,4,56,23,54,6,56};
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					//System.out.println(temp);
				}
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		System.out.println();
		System.out.println(arr[9]+arr[10]);
	}

}
