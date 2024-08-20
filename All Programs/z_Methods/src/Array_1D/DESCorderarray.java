package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class DESCorderarray {

	public static void main(String[] args) 
	{ 
		int [] sendingfromhere=initalizationDESC();
		printdesc(sendingfromhere);
	

	}
	public static int[] initalizationDESC()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int [] elements=new int [size];
		for(int i=0;i<elements.length;i++)
		{
			elements[i]=sc.nextInt();
		}
		return elements;
	}
	public static void printdesc(int [] received)
	{
		for(int i=received.length-1;i>=0;i--)
		{
			Arrays.sort(received);
			received.toString();
			System.out.print(received[i]+" ");
		}
	}

}
