package ImportentPrograms;

public class VowelsCount {

	public static void main(String[] args) 
	{
		String  s= "Welcomeonboard";
		int count=0;
		char start;
		for(int i=0; i<s.length();i++)
		{
		
			start=s.charAt(i);
			count++;
			System.out.print(i +"-"+start);
		}
		System.out.print(count);
	}

}
