package PracticeingPrograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int a=27;
		for(int i=2; i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("prime number");
				break;
			}
			else
			{
			System.out.println("Not a prime");
			break;
		}}
	}

}
