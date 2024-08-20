package HardWork;

public class CountNoofDigits {

	public static void main(String[] args)
	{
		int num=213443423;
		int count=0; 
		for(int i=0;i<=num;i++)
		{
		
			count++;
			num/=10;
		}
		System.out.print(count);
	}

}
