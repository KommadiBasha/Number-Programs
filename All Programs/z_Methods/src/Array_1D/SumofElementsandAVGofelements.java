package Array_1D;

import java.util.Scanner;

public class SumofElementsandAVGofelements {

	public static void main(String[] args) 
	{
		int [] array=initalizationarray();
		sumandaverage(array);
		int avg=array.length;
		avg=avg/2;
		System.out.println(avg);
	}
	public static int [] initalizationarray()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size....");
		int size=sc.nextInt();
		System.out.println("enter values....");
		int [] elements=new int[size];
		for(int i=0;i<elements.length;i++)
		{
			elements[i]=sc.nextInt();
		}
		return elements;
	}
	public static void sumandaverage(int [] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
