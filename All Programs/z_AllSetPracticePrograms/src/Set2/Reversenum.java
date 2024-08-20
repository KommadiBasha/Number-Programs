package Set2;

public class Reversenum {

	public static void main(String[] args) 
	{
		int i=1234567;
		int reverse=0;
		while(i>0)
		{
			int a=i%10;
			reverse=(reverse*10)+a;
			i/=10;
		}
		System.out.print(reverse);
	}

}
