package Forloop;

public class MergingTwoArrays {

	public static void main(String[] args) 
	{
		int [] a= {21,43,35,645,3,33,54665,645,32432,34};
		int [] b= {66,56,57,6,43,6,66,75,5,4,55,56,76,453};
		
		int [] merge=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			merge[j+a.length]=b[j];
		}
		for(int i=0;i<merge.length;i++)
		{
			System.out.print(merge[i]+" ");
		}

	}

}
