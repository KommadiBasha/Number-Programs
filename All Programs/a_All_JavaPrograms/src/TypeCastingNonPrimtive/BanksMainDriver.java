package TypeCastingNonPrimtive;

public class BanksMainDriver {

	public static void main(String[] args) 
	{
		System.out.println("Just Object creation......");
		
		SBIBank b= new SBIBank();
		b.checkBalance();
		//b.intrest();
		System.out.println(b.intrest());
		b.payMoney();
		
		System.out.println();
		System.out.println("Parent refference and chilld object PaytmClass... ");
		AllBanks allpaytm;
		allpaytm=new Paytm();
		allpaytm.checkBalance();
		System.out.println(allpaytm.intrest());
		allpaytm.payMoney();
		
		
		
		
		AllBanks allpaytmExtra=new Paytm();
		Paytm p=(Paytm)allpaytmExtra;
		
		
		p.checkBalance();
		p.intrest();
		p.payMoney();
		p.walt();
		
		
		
		
		
		System.out.println();
		System.out.println("Parent refference and chilld object ICICIBankClass... ");
		AllBanks allicici;
		allicici=new ICICIBank();
		allicici.checkBalance();
		System.out.println(	allicici.intrest());
		allicici.payMoney();

	}

}
