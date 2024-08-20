package HardWork;

public class Underscoore {

	public static void main(String[] args) 
	{
		String s="i am not happy";
		String space="";
		String under="-";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			space=space+s.charAt(i);
			space=space+under;
			}
		}
		System.out.println(space.substring(0,space.length()-1));
	}

}
