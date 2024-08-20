package Constructors;

public class StringBuffer_Constructor 
{
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("It is a mutable class and equals method not overiden");
	String s= new String(sb);
	System.out.println(s);
	}
}
