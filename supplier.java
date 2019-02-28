
/**
 * Write a description of class supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class item
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    
    public int getId()
    {
        // initialise instance variables
        return id;
    }
    
    public String getName()
    {
        // initialise instance variables
        return name;
    }
    
    public String getEmail()
    {
        // initialise instance variables
        return email;
    }
    
    public String getPhoneNumber()
    {
        // initialise instance variables
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        // initialise instance variables
        return location;
    }
            
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    public void setName(String name)
    {
        // initialise instance variables
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        // initialise instance variables
        this.email=email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        // initialise instance variables
        this.phoneNumber=phoneNumber;
    }
    
    public void setLocation(Location location)
    {
        // initialise instance variables
        this.location=location;
    }
    
    public void printData (){
        //
        System.out.println(name);
    }
}
