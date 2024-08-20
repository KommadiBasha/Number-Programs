package IFElseif_LadderStatement;

public class IfElseifLadderStudent 
{
	public static void main(String[] args) {
		
		int a=12;
		int b=34;
		int c=899;
		System.out.println(" \r\n"+ "		int a=12;\r\n"
				+ "		int b=34;\r\n"
				+ "		int c=899;");
		if(a>b && a>c)
		{
			System.out.println(" a is greater...");
		}
		else if(b>c & b>a)
		{
			System.out.println(" b is greater...");
		}
		else
		{
			System.out.println("c is greater...");
		}
	}
}
