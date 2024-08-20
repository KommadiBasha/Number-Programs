package HardWork;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6,7,8,9,11,22,3,4,4,5,55,66,7,7,888,99,776,6,6,7};
		Arrays.sort(arr);
		arr.toString();
		int withoutduplicates=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					
					System.out.print(arr[i]+" ");
				}
			}
		}
		System.out.println();
	
	}

}
