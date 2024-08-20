package String;

public class CheckforSubStirng {

	public static void main(String[] args) 
	{
		String main="ABCDEFG";
		String sub="xyd";
		
		for (int i = 0; i < main.length(); i++)
		{
			for (int j = i+1; j < main.length(); j++)
			{
				String substr=main.substring(i, j);
				if(sub.equals(substr))
				{
					System.out.println("matched...sub :"+sub +"  substr :"+ substr+ " originalstring  : "+main);
				}
				else
				{
					System.out.println("not matched ....");
					break;
				}
				
			}
		}

	}

}
