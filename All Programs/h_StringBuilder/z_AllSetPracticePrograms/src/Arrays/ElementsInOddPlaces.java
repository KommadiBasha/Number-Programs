package Arrays;

import java.util.Scanner;

public class ElementsInOddPlaces 
{
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int [] arr= new int[size];
	System.out.println("enter values ");
	int extract=0;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=1;i<arr.length;i+=2)
	{
		
			System.out.println(arr[i]);
		
		
	}}
	
}
