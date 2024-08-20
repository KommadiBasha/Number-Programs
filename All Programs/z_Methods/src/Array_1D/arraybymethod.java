package Array_1D;

public class arraybymethod {

	public static void main(String[] args) 
	{
		int [] arr=new int[5];
		justdeclaredarray(arr);

	}
	public static void justdeclaredarray(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
