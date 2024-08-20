package NumberPrograms;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		
		boolean flag=false;
		for(int i=1;i<=m;i++)
		{
			int square= i*i;
			if(square==m)
			{
				flag=true;
				break;
			}
		}
			if(flag==true)
			{
				System.out.println("perfect square...");
				
			}
			else
			{
				System.out.println("not perfect square...");
			
			}
		

	}

}
