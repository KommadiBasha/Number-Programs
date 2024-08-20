package SwitchCaseStatement;

import java.util.Scanner;

public class SelectingDistrictsBasedOnPINCode 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the district from 1 to 26  ");
		int pincode =sc.nextInt();
		
		switch(pincode)
		{
		case 1:
		{
		 System.out.println("SRI -> Srikakulam  HQ Srikakulam ");
		 break;
		}
		case 2:
		{
		 System.out.println("PAR -> Parvathipuram (Manyam) HQ Parvathipuram ");
		 break;
		}
		case 3:
		{
		 System.out.println("VIZ -> Vizianagaram HQ  Vizianagaram ");
		 break;
		}
		case 4:
		{
		 System.out.println("VIS ->  Visakhapatnam HQ  Visakhapatnam ");
		 break;
		}
		case 5:
		{
		 System.out.println("ALL ->  Alluri Sitharama Raju HQ Paderu ");
		 break;
		}
		case 6:
		{
		 System.out.println("ANA -> Anakapalli  HQ  Anakapalli");
		 break;
		}
		case 7:
		{
		 System.out.println("KAK -> Kakinada HQ Kakinada");
		 break;
		}
		case 8:
		{
		 System.out.println("EAS -> East Godavari  HQ Rajamahendravaram ");
		 break;
		 }
		case 9:
		{
		 System.out.println("KON -> Dr.B.R Ambedkar Konasemma  HQ Amalapuram");
		 break;
		 }
		case 10:
		{
		 System.out.println("ELU -> Eluru HQ Eluru");
		 break;
		 }
		case 11:
		{
		 System.out.println("WES -> West Godavari HQ Bhimavaram");
		 break;
		 }
		case 12:
		{
		 System.out.println("NTR -> NTR HQ Vijayawada");
		 break;
		 }
		case 13:
		{
		 System.out.println("KRi -> Krishna HQ Machilipatnam ");
		 break;
		 }
		case 14:
		{
		 System.out.println("PAl -> Palnadu HQ Narasaraopeta ");
		 break;
		 }
		case 15:
		{
		 System.out.println("GUN -> Guntur HQ Guntur");
		 break;
		 }
		case 16:
		{
		 System.out.println("BAP -> Bapatla HQ Bapatla");
		 break;
		 }
		case 17:
		{
		 System.out.println("PRA -> Prakasam HQ Ongole ");
		 break;
		 }
		case 18:
		{
		 System.out.println("NEL -> Sri Potti Sriramulu Nellore HQ Nellore ");
		 break;
		 }
		case 19:
		{
		 System.out.println("KUR -> Kurnool HQ Kurnool");
		 break;
		 }
		case 20:
		{
		 System.out.println("NAN -> Nandyal  HQ Nandyal  ");
		 break;
		 }
		case 21:
		{
		 System.out.println("ANA -> Anantapur HQ Anantapur ");
		 break;
		 }
		case 22:
		{
		 System.out.println("SSS -> Sri Sathya Sai HQ Puttaparthi");
		 break;
		 }
		case 23:
		{
		 System.out.println("CUD -> YSR HQ Kadapa");
		 break;
		 }
		case 24:
		{
		 System.out.println("ANN -> Annamayya HQ Rayachoti");
		 break;
		 }
		case 25:
		{
		 System.out.println("TIR -> Tirupati HQ Tirupati");
		 break;
		 }
		case 26:
		{
		 System.out.println("CHI -> Chittoor HQ Chittoor");
		 break;
		 }
		
		
		
		
		}
	}
}
