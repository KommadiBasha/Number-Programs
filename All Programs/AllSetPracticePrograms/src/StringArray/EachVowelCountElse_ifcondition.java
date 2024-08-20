package StringArray;

import java.util.Scanner;

public class EachVowelCountElse_ifcondition {

	public static void main(String[] args) 
	{
		String s="welcome onboard";
		int a=0,e=0,i=0,o=0,u=0;
		for(int i1=0;i1<s.length();i1++)
		{
			System.out.print(s.charAt(i1)+" ");
			if(s.charAt(i1)=='a')
			{
				a++;
			}
			else if(s.charAt(i1)=='e' )
			{
				e++;
			}
			else if( s.charAt(i1)=='i')
			{
				i++;
			}
			else if(s.charAt(i1)=='o')
			{
				o++;
			}
			else if(s.charAt(i1)=='u')
			{
				u++;
			}
		}
		System.out.println( );
		System.out.println("count a letter :"+a);
		System.out.println("count e letter :"+e);
		System.out.println("count i letter :"+i);
		System.out.println("count o letter :"+o);
		System.out.println("count u letter :"+u);
		}

}
