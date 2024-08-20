package StringArray;

public class VowelsCount {

	public static void main(String[] args) 
	{
	String [] str= {"welcome","onboard"};
	int vowelCount=0;
	String vowels="aeiouAEIOU";
	for(String s: str)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowels.contains(Character.toString(ch)))
			{
				vowelCount++;
			}
		}
	}
	System.out.println("vowels "+vowelCount);
	}

}
