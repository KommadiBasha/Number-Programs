package Array_1D;

import java.util.Scanner;

public class ASCnormalway {

	public static void main(String[] args) 
	{
		int [] usedforStore=initalizationasc();
		print(usedforStore);
		System.out.println("printed will passing arr used :");
		for(int i=0;i<usedforStore.length;i++)
		{
			for(int j=i+1;j<usedforStore.length;j++)
			{
				if(usedforStore[i]<usedforStore[j])
				{
					int temp=usedforStore[i];
					usedforStore[i]=usedforStore[j];
					usedforStore[j]=temp;
				}
			
			}
		System.out.print(usedforStore[i]+" ");
		}
	System.out.println();
	}
	public static int [] initalizationasc()
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
	public static void print(int [] arr)
	{
		
		System.out.println("printed in normal print loop :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
