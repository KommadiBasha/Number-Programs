package Set2;

public class ProductOfTheNumbers {

	public static void main(String[] args) 
	{
		int i=1234;
		int product=1;
		while(i>0)
		{
			int last=i%10;
			product =product*last;
			i/=10;
		}
		System.out.println(product);
	}

}
