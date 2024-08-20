package NumberArray;

public class DecendingOrder 
{
	public static void main(String[] args) 
	{
		int [] array= {12,3423,55,6,2,2,67,767,8564,34,12,3,45456,65};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
	}
}
