package testpolymorphism;

public class Person {
    private String personName;
    private String personAddress;
    public Person()
    {
    	this.personAddress="Ambala";
    	this.personName="Pankaj Malik";
    }
    public Person(String personName,String personAddress)
    {
    	this.personName=personName;
    	this.personAddress=personAddress;
    }
    public void setPersonName(String personName)
    {
    	this.personName=personName;
    }
    public String getPersonName()
    {
    	return this.personName;
    }
    public void setPersonAddress(String personAddress)
    {
    	this.personAddress=personAddress;
    }
    public String getPersonAddress()
    {
    	return this.personAddress;
    }
    public void display()
    {
    	System.out.println("Person Display ");
    	System.out.println("Person Name : "+this.getPersonName());
    	System.out.println("Person Address : "+this.getPersonAddress());
    }
}
