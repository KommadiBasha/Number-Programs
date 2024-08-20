package SingleTon_Class;

public class PrivateConstrutor 
{
 static PrivateConstrutor ref=null;
 
 private PrivateConstrutor()
 {
 
 }
 public static PrivateConstrutor modify()
 {
	 if(ref==null)
	 {
		 ref= new PrivateConstrutor();
	 }
	 return ref;
 }
 public static void main (String [] args)
 {
	 System.out.println(ref.modify());
	 
	 System.out.println(",./;'][!@#$%^&*()_+");
	 
	 PrivateConstrutor p = new PrivateConstrutor();
	 PrivateConstrutor p1 =new PrivateConstrutor();
	 
	 System.out.println(p.modify());
	 System.out.println(p1.modify());
	 
	 
	 
 }
}
