package StringP;

import java.util.Scanner;

public class FrequencyCharacter {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		int [] freq=new int[s1.length()];
		char c[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			freq[i]=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(c[i]==c[j])
				{
					freq[i]++;
					c[j]=' ';
				}
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(c[i]!=' ' && c[i]!=0)
			{
				System.out.print( c[i]+"-"+freq[i]+" ");
				
			}
		}
	}

}
