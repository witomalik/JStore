
/**
 * Write a description of class invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    

    /**
     * Constructor for objects of class item
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        // initialise instance variables
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
    }
    
    public int getId()
    {
        // initialise instance variables
        return id;
    }
    
    public Item getItem()
    {
        // initialise instance variables
        return item;
    }
    
    public String getDate()
    {
        // initialise instance variables
        return date;
    }
    
    public int getTotalPrice()
    {
        // initialise instance variables
        return totalPrice;
    }
    
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    public void setIdItem(int idItem)
    {
        // initialise instance variables
        this.item=item;
    }
    
    public void setDate(String date)
    {
        // initialise instance variables
        this.date=date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        // initialise instance variables
        this.totalPrice=totalPrice;
    }
    
    public void printData(){
        //
        System.out.println(totalPrice);
    }
}
