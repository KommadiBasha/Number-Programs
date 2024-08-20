package Set2;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter some numbersss");
	int i=sc.nextInt();
	int sum=0;
	 while(i>0)
	 {
		 int last=i%10;
		 sum=sum+last;
		 i/=10;
		
	 }
	 System.out.println(sum);
	}

}
//3
//3+2=5
//5+1=6

//answer 6