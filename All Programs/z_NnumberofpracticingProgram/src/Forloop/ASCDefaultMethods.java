package Forloop;

import java.util.Arrays;

public class ASCDefaultMethods {

	public static void main(String[] args) 
	{
		int [] arr=new int[] {323,546,534,4,5434,34,6,6767,45,65,657,45,45,4,65,34,45456,};
		Arrays.parallelSort(arr);
		arr.toString();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
