package HardWork;

public class CopyArray {

	public static void main(String[] args)
	{
		int [] a= {343,565,4,674334,6,44,65,465,74,6545,765436,65};
		int [] copied=a;
		for(int i=0;i<copied.length;i+=2)
		{
			System.out.print(copied[i]+" ");
		}

	}

}
