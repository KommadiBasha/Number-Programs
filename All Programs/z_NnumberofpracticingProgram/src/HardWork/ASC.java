package HardWork;

public class ASC {

	public static void main(String[] args) 
	{
		int [] a =new int []{12,3,43,54,66,77,65,44,56,7,7,8};
		for (int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}