package Array_1D;

public class Initilaizationtype_1 {

	public static void main(String[] args) 
	{
		int [] arr=new int[5];
		arr[0]=11;
		arr[1]=1;
		arr[2]=2;
		arr[3]=333;
		arr[4]=4;
		arrinitilized(arr);
	}
	public static void arrinitilized(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
