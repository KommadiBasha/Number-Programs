package Encapsulation;

public class EncapsulationProgram
{
    private String name;
    private long number;
    
    
    public void setName(String s)
    {
    	this.name=s;
    }
    public void setNumber(long i)
    {
    	this.number=i;
    }
    
    public long getNumber()
    {
    	return number;
    }
    public String getName()
    {
    	return name;
    }
    public static void main(String[] args) {
    	EncapsulationProgram e= new EncapsulationProgram();
    	e.setName("Sani");
    	e.setNumber(9985270826l);
    	
    System.out.println(e.getName());
    System.out.println(e.getNumber());
	}
}
