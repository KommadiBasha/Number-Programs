package JavaQuiz;

import java.util.Scanner;

public class SmallToCapital_CtoS {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		
		String store="";
		
		for(int i=0 ;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				int c=(int)str.charAt(i);
				
				char c1=(char) (c-32);
				store=store+c1;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				int cc=(int)str.charAt(i);
				
				char c2=(char) (cc+32);
				store=store+c2;
			}
			else
			
			{
				store=store+str.charAt(i);
			}
		}
		System.out.println(store);
	}

}
