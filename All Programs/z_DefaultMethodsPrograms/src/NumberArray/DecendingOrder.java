package NumberArray;

import java.util.Arrays;

public class DecendingOrder {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,31,34,6,7,98,675,4,434,123,345,465,776};
		Arrays.sort(arr);
		arr.toString();
		int max=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
		


	}

}
