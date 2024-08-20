package Array_1D;

import java.util.Scanner;

public class AddingElementAtLastIndex_InceasingLength {

	public static void main(String[] args) 
	{
		int [] maininitalizationArray=initalizationArr();
		printElementsOfAnArray(maininitalizationArray);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value..");
		int addelement=sc.nextInt();
		
		int[] store=addAnElemtentAtLastIndex(maininitalizationArray, addelement);
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
	public static int [] addAnElemtentAtLastIndex(int [] secArr,int addElement)
	{
		int[] resArr=new int[secArr.length+1];
		
		for(int i=0;i<secArr.length;i++)
		{
			resArr[i]=secArr[i];
		}
		resArr[secArr.length]=addElement;
		
		return resArr;
	}

}
