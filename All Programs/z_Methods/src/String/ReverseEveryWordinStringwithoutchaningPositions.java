package String;

import java.util.Scanner;
//pending this program......................................................
public class ReverseEveryWordinStringwithoutchaningPositions {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
			
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
				rev=rev+str.charAt(i);
		}
		
		
	}
}
