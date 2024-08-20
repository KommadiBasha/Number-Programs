package HardWork;

public class Reversenumber1 {

	public static void main(String[] args) 
	{
	int num=28238;
	while(num!=0)
	{
		int last=num%10;
		System.out.print(last);
		num/=10;
	}

	}

}
