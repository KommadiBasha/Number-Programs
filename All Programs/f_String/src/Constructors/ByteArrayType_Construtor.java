package Constructors;

public class ByteArrayType_Construtor 
{
	public static void main(String[] args) 
	{
		byte [] b= {48,49,50,65,66,67,97,98,99};//-129 CTE
		byte [] b1= {12,1,127,-128 };//-129 CTE
		
		
		String s1= new String(b);
		String s2= new String(b1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	
	
}
