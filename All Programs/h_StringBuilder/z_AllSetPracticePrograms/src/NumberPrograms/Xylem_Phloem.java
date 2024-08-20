package NumberPrograms;

import java.util.Collections;
import java.util.Scanner;

public class Xylem_Phloem {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter number...");
	 int num=sc.nextInt();
	 int temp=num;
	
	 int firstandlastSum=0;
	 int remainingSum=0;
	 while (num>0)
	 {
		int rev=num%10;
		if(temp == num || num <=9)
		{
		  
			  firstandlastSum+=rev;
			//System.out.print(firstandlastSum+" ");
		}
		else
		{
			remainingSum+=rev;
			//System.out.print(remainingSum+" ");
		}
		num/=10;
	 	}
	 if(firstandlastSum==remainingSum)
		{
			System.out.println("xylem");
		}
		else
		{
			System.out.println("pholem");
		}
	}

}
