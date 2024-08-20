package JavaQuiz;

public class StaticVer 
{
	String name="Ramesh";
	public	StaticVer()
	{
		name="Prabhas";
	}
	public static void main(String[] args) 
	{
		StaticVer s= new StaticVer();
		System.out.println("the name is :"+s.name);

	}

}
