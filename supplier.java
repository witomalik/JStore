
/**
 * Merupakan Class Supplier.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Supplier
{
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
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
    
    /**
     * Method of class Supplier
     * @return id
     */
    public int getId()
    {
        // return dari accessor 
        return id;
    }
    
    /**
     * Method of class Supplier
     * @return name
     */
    public String getName()
    {
        // return dari accessor 
        return name;
    }
    
    /**
     * Method of class Supplier
     * @return getEmail
     */
    public String getEmail()
    {
        // return dari accessor 
        return email;
    }
    
    /**
     * Method of class Supplier
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        // return dari accessor 
        return phoneNumber;
    }
    
    /**
     * Method of class Supplier
     * @return location
     */
    public Location getLocation()
    {
        // return dari accessor 
        return location;
    }
    
    /**
     * Method of class Supplier
     * @param id
     */
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    /**
     * Method of class Supplier
     * @param name
     */
    public void setName(String name)
    {
        // initialise instance variables
        this.name=name;
    }
    
    /**
     * Method of class Supplier
     * @param email
     */
    public void setEmail(String email)
    {
        // initialise instance variables
        this.email=email;
    }
    
    /**
     * Method of class Supplier
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        // initialise instance variables
        this.phoneNumber=phoneNumber;
    }
    
    /**
     * Method of class Supplier
     * @param location
     */
    public void setLocation(Location location)
    {
        // initialise instance variables
        this.location=location;
    }
    
    /**
     * Method of class Supplier
     * fungsi untuk print variable name
     */
    public void printData (){
        //print out variable name
        System.out.println("==========SUPPLIER=======");
        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("No telpon :" + phoneNumber);
        System.out.println("Lokasi Supplier :" + location.getCity());
    }
}
