package NumberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter number...");
		 int num=sc.nextInt();
		 int temp=num;
		// System.out.println(temp);
		 int square= num*num;
		System.out.println("num*num :"+square);
		
		while(num!=0)
		{
			
			int	rev=square%10,rev1=square%100,rev2=square%1000,rev3=square%10000;
			num/=100;
			if(rev==square || rev1==square || rev2==square || rev3==square)
			{
				System.out.println("automorphic number...");
				break;
			}
			else
			{
				System.out.println("not automorphic number..");
				break;
			}	
		}
		 

	}

}
