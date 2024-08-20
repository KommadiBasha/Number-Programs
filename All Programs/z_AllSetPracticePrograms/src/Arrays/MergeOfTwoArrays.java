package Arrays;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class MergeOfTwoArrays {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of array one.");
	int size=sc.nextInt();
	int [] arrayone=new int[size];
	int [] arraytwo=new int[size];
	int [] c=new int[size*2];
	System.out.println("Enter the elements of arrayone");
	for(int i=0;i<arrayone.length;i++)
	{
		arrayone[i]=sc.nextInt();
	}
	System.out.println("Enter the elements of arraytwo");
	for(int i=0;i<arrayone.length;i++)
	{
		arraytwo[i]=sc.nextInt();
	}
	System.out.println("elements of array");
	for(int i=0;i<arrayone.length;i++)
	{
		c[i]=arrayone[i];
	}
	//this line for second  array elements
	int j=0;
	for(int i=arrayone.length;i<c.length;i++)
	{
		c[i]=arraytwo[j++];
	}
	for(int i=0;i<c.length;i++)
	{
		 System.out.println(c[i]+" ");
	}
	}
}
