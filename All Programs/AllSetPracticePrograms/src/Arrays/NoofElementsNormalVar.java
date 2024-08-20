package Arrays;

public class NoofElementsNormalVar 
{
	public static void main(String[] args) {
		int [] num= new int [] {1,2,34};
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			count++;
		}
		System.out.print("count var "+count);
		System.out.println();
		System.out.print("By using length method "+num.length);
	}

}
