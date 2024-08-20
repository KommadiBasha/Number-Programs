package String;

public class LowertoUpperinString {

	public static void main(String[] args) 
	{
		String s="Hi hellO hoW @@#$ are YOu";
		System.out.println("original String ");
		
		System.out.println();
		System.out.println(s);
		String converted= convertLtoU(s);
		System.out.println(converted);
	}
	public static String convertLtoU(String s1)
	{
		
		String store="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				store=store+' ';	
			}
			else if(ch>='A' && ch<='Z')
			{
				char ch1=(char)(ch+32);
				store=store+ch1;
			}
			else if(ch>='a' && ch<='z')
			{
				char ch2=(char)(ch-32);
				store=store+ch2;
			}
			else if(!(ch==' ' || ch>='A' && ch <='Z' ||  ch>='a' && ch <='z'))	
			{
				store=store+ch;
			}
		}
		return store;
		
	}

}
