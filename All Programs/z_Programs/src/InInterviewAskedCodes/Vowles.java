package InInterviewAskedCodes;

public class Vowles {

	public static void main(String[] args)
	{
		String  s = "welcome";
		int start =0;
		 
		for(int i=1;i<s.length();i++)
		{
			
			
			start=s.charAt(i);
			System.out.println(i);
		}
		System.out.println(start);
	}

}
