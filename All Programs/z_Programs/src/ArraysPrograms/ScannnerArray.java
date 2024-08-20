package ArraysPrograms;

import java.util.Scanner;

public class ScannnerArray 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int i[]=new int [size];
		for(int i1=0;i1<size;i1++)
		{
			i[i1] =sc.nextInt();
		}
		System.out.println("Loope itterating...now");
		for(int i1=0;i1<size;i1++)
		{
			System.out.println(i[i1]);
		}
		
	}

}
