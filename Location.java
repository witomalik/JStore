
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String city;
    private String province;
    private String description;
    

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city=city;
        this.province=province;
        this.description=description;
        
    }

    public String getProvince()
    {
        // initialise instance variables
        return province;
    }
    
    public String getCity()
    {
        // initialise instance variables
        return city;
    }
    
    public String getDesciption()
    {
        // initialise instance variables
        return description;
    }
    
    public void setProvince(String province)
    {
        // initialise instance variables
        this.province=province;
    }
    
    public void setCity(String city)
    {
        // initialise instance variables
        this.city=city;
    }
    
    public void setDescription(String description)
    {
        // initialise instance variables
        this.description=description;
    }
    
      public void printData(){
       //
       System.out.println(province);
    }
}
