
/**
 * Write a description of class item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    /**
     * Constructor for objects of class item
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
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
    
    public int getStock()
    {
        // initialise instance variables
        return stock;
    }
    
    public int getPrice()
    {
        // initialise instance variables
        return price;
    }
    
    public String getCategory()
    {
        // initialise instance variables
        return category;
    }
    
    public Supplier getSupplier()
    {
        // initialise instance variables
        return supplier;
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
    
    public void setStock(int stock)
    {
        // initialise instance variables
        this.stock=stock;
    }
    
    public void setPrice(int price)
    {
        // initialise instance variables
        this.price=price;
    }
    
    public void setCategory(String category)
    {
        // initialise instance variables
        this.category=category;
    }
    
    public void setSupplier(Supplier supplier)
    {
        // initialise instance variables
        this.supplier=supplier;
    }
    
    public void printData(){
        //
        System.out.println(name);
    }
    
    
}
