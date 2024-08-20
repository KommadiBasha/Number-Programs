package Array_1D;

import java.util.Scanner;

public class AddingElementAtSpecifiedPosition {

	public static void main(String[] args) 
	{
		int [] mainArr=initalizationArr();
		printElementsOfAnArray(mainArr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value..");
		int addelement=sc.nextInt();
		
		System.out.println("enter position to add..");
		int positionofelement=sc.nextInt();
		int[] store= addAnElemtentAtSpecifiedIndex(mainArr, addelement, positionofelement);
		System.out.println("after adding ");
		printElementsOfAnArray(store);
		//System.out.println(store);
		
	}
	public static int [] initalizationArr()
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
	public static void printElementsOfAnArray(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static int [] addAnElemtentAtSpecifiedIndex(int [] secArr,int newElement, int position)
	{
		int[] resArr=new int[secArr.length+1];
		
		if(position<0 || position>secArr.length)
		{
			System.out.println("Invalid position");
			System.out.println("data can't added at this position"+ position);
		}
		else
		{
			for(int i=0;i<resArr.length;i++)
			{
				if(i==position)
				{
					resArr[i]=newElement;
				}
				else if(i<position)
				{
					resArr[i]=secArr[i];
				}
				else
				{
					resArr[i]=secArr[i-1];
				}
			}
		}
		
		return resArr;
	}

}
