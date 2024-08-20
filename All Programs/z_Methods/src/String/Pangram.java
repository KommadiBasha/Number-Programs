package String;

public class Pangram {

	public static void main(String[] args) 
	{
		String str="The quick brown fox jumps over the lazy dog";
		str=str.toUpperCase();
		
		boolean [] bstatusArr=new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int index=ch-65;
			if(index>= 0 && index<=25)
			{
				bstatusArr[index]=true;
			}
		}
	 boolean flag= true;
	 for(int i=0; i<bstatusArr.length;i++)
	 {
		 if(!bstatusArr[i])
		 {
			 flag=false;
			 break;
		 }
	 }
	 if(flag)
	 {
		 System.out.println("Pangram");
	 }
	 else
	 {
		 System.out.println("Not a Pangram...");
	 }
	}

}
