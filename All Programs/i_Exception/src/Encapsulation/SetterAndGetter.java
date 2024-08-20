package Encapsulation;
//Encapsulation program................................
public class SetterAndGetter 
{
	private int vehicleNum;
	private String vehicleOwner;
	
	public void setVechileNum(int i, String s)
	{
		this.vehicleNum=i;
		this.vehicleOwner=s;
	}
	public String getVehicleOwner()
	{
		return vehicleOwner;
	}
	public int getVehicleNum()
	{
		return vehicleNum;
	}
	
	public static void main(String[] args) {
		SetterAndGetter  s= new SetterAndGetter ();
		s.setVechileNum(2229,"Sohile");
		
		
		System.out.println(s.getVehicleNum());
		System.out.println(s.getVehicleOwner());
	}
	
}
