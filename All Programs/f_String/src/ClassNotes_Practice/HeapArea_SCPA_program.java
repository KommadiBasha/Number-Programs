package ClassNotes_Practice;

public class HeapArea_SCPA_program 
{
	public static void main(String[] args)
	{
		String s1= new String("durga");
		s1.concat("software");
		String s2= s1.concat("Solutions");
		s1=s1.concat("soft");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.charAt(3));
	}
}
