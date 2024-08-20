package JavaQuiz;

public class InitializingInConstructor 
{
	String s;
	public InitializingInConstructor()
	{
		s+="hello";
	}
	public static void main(String[] args) 
	{
		InitializingInConstructor i=	new InitializingInConstructor();
	
		
	System.out.println(i.s);
	System.out.println(new InitializingInConstructor().s);

	}

}
