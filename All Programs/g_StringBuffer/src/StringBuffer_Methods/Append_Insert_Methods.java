package StringBuffer_Methods;

public class Append_Insert_Methods 
{
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("volatile");
		sb.append(" is used for variables");
		
		sb.insert(0, "it is modifer ");
		System.out.println(sb);
}
}
