package ImportentPrograms;

public class Welecome {

	public static String m1() 
	{
		String s="Welcome";
		char ref;
		for(int i=0;i<s.length();i++)
		{
			ref= s.charAt(i);
			if(s.length()==i)
			{
				return s;
			}
			System.out.print(ref+ "-");
		}
		return null;
	}
public static void main(String[] args) {
	m1();
}
}
