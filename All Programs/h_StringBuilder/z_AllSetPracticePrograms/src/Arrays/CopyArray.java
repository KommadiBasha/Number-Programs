package Arrays;

public class CopyArray {

	public static void main(String[] args) 
	{
		int [] arr=new int [] {22,11,33,44};
		int [] copy=arr;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<copy.length;i++)
		{
			System.out.print(copy[i]+" ");
		}
		
	}

}
