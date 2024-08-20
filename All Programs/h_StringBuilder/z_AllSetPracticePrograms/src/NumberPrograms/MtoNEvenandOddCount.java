package NumberPrograms;

import java.util.Scanner;

public class MtoNEvenandOddCount {

	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter start number...");
	 int start=sc.nextInt();
	 System.out.println("enter end number...");
	 int end=sc.nextInt();
	 int countE=0,countO=0;
	 for(int i=start;i<=end;i++)
	 {
		
		 if(i%2==0)
		 {
			 System.out.print(i+" ");
			 countE++;
			 System.out.println();
		 }
		 else
		 {
			 System.out.print(i+" ");
			 countO++;
		 }
	 }
	 System.out.println();
	 System.out.println("even count :"+countE);
	 System.out.println("odd count :"+countO);
	}

}
