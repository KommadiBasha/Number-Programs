package HardWork;

public class StringCharPrint {

	public static void main(String[] args) 
	{
		String s="hi hello";
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
