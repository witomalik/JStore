
/**
 * Merupakan Class Location.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Location
{
    // variabel yang digunakan dalam class
    private String city;
    private String province;
    private String description;
    

    /**
     * Constructor for objects of class Location
     * @param city 
     * @param province
     * @param description
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city=city;
        this.province=province;
        this.description=description;
        
    }

    /**
     * Method for objects of class Location
     * @return province
     */
    public String getProvince()
    {
        // return dari accessor 
        return province;
    }
    
    /**
     * Method for objects of class Location
     * @return city
     */
    public String getCity()
    {
        // return dari accessor 
        return city;
    }
    
    /**
     * Method for objects of class Location
     * @return description
     */
    public String getDesciption()
    {
        // return dari accessor 
        return description;
    }
    
    /**
     * Method for objects of class Location
     * @param province
     */
    public void setProvince(String province)
    {
        // initialise instance variables
        this.province=province;
    }
    
    /**
     * Method for objects of class Location
     * @param city
     */
    public void setCity(String city)
    {
        // initialise instance variables
        this.city=city;
    }
    
    /**
     * Method for objects of class Location
     * @param description
     */
    public void setDescription(String description)
    {
        // initialise instance variables
        this.description=description;
    }
    
    /**
     * Method for objects of class Location
     * fungsi untuk print variable name
     */
    public void printData(){
       // return dari accessor 
       System.out.println(province);
    }
}
