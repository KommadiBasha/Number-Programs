package Arrays;

public class MergeingOf2arrays {

	public static void main(String[] args) 
	{
		int [] arr1= {32,43,34,5,46,2,12,45,67,68,77,43,2,3,7,87,8,89,8,8,76,32,21};
		int [] arr2= {97,6,6,56,89,776,4,42,5,56,7,8,8,96,4,54,34,4,6,7,4,34,6};
		int [] c= new int [arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			c[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			c[j+arr1.length]=arr2[j];
			
		}
		System.out.println();
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]+" ");
		}
		
	}

}
