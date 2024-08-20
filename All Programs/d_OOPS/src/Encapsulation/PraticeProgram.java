package Encapsulation;

public class PraticeProgram 
{
   private String s;
   private long l;
   private char gender;
   
   public void setS(String s)
   {
	   this.s=s;
   }
   public String getS()
   {
	   return s;
   }
   public static void main(String[] args) 
   {
	   PraticeProgram  p=new PraticeProgram ();
	   p.setS("Basha");
	   System.out.println(p.getS());
   }
}
