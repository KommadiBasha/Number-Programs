package StringP;

import java.util.Scanner;

public class MaxandMinCharinString {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		
		int [] freq= new int[s1.length()];
		char minChar= s1.charAt(0), maxChar = s1.charAt(0);
		int min,max;
		 
		char c[]=s1.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			freq[i]=1;
			for(int j=i+1; j<c.length;j++)
			{
				if(c[i]==c[j] && c[i]!=' ' && c[i]!='O')
				{
					freq[i]++;
					c[j]='O';
				}
			}
		}
		 min=max=freq[0];
		 for(int i=0;i<c.length;i++)
		 {
			 if(min > freq[i] && freq[i]!='O')
			 {
				 min=freq[i];
				 minChar=c[i];
			 }
			 if(max<freq[i])
			 {
				 max= freq[i];
				 maxChar =c[i];
			 }
		 }	
		 System.out.println("min char :"+minChar);
		 System.out.println("max char :"+maxChar);
	}

}
