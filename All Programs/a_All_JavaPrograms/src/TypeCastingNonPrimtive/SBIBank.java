package TypeCastingNonPrimtive;

public class SBIBank extends ICICIBank
{
	public String intrest()
	{
		return 3+" %SBI class" ;
	}
	public  void payMoney()
	{
		System.out.println("paymoneyMethod SBIBank  class");
	}
	public void checkBalance()
	{
		System.out.println("check balance method SBIBank  class");
	}
}
