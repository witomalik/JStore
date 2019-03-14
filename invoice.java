
/**
 * Merupakan Class Invoice.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Invoice
{
    // variabel yang digunakan dalam class
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    

    /**
     * Constructor for objects of class Invoice
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Invoice(int id, Item item, String date, int totalPrice, int totalItem, InvoiceStatus status)
    {
        // initialise instance variables
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.totalItem=totalItem;
        this.status=status;
    }
    
    /**
     * Method of class Invoice
     * @return id
     */
    public int getId()
    {
        // return dari accessor 
        return id;
    }
    
    /**
     * Method of class Invoice
     * @return getItem
     */
    public Item getItem()
    {
        // return dari accessor 
        return item;
    }
    
    /**
     * Method of class Invoice
     * @return date
     */
    public String getDate()
    {
        // return dari accessor 
        return date;
    }
    
    /**
     * Method of class Invoice
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        // return dari accessor 
        return totalPrice;
    }
    
    /**
     * Method of class Invoice
     * @return totalPrice
     */
    public int getTotalItem()
    {
        // return dari accessor 
        return totalItem;
    }
    
    /**
     * Method of class Invoice
     * @return totalPrice
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // return dari accessor 
        return status;
    }
    
    /**
     * Method of class Invoice
     * @param id
     */
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    /**
     * Method of class Invoice
     * @param item
     */
    public void setIdItem(int idItem)
    {
        // initialise instance variables
        this.item=item;
    }
    
    /**
     * Method of class Invoice
     * @param date
     */
    public void setDate(String date)
    {
        // initialise instance variables
        this.date=date;
    }
    
    /**
     * Method of class Invoice
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        // initialise instance variables
        this.totalPrice=totalPrice;
    }
    
    /**
     * Method of class Invoice
     * @param totalPrice
     */
    public void setTotalItem(int totalItem)
    {
        // initialise instance variables
        this.totalItem=totalItem;
    }
    
    /**
     * Method of class Invoice
     * @param totalPrice
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        // initialise instance variables
        this.status=status;
    }
    
    /**
     * Method of class Invoice
     * fungsi untuk print variable totalPrice
     */
    public void printData(){
        //print out variable totalPrice
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + id);
        System.out.println("Date :" + date);
        System.out.println("Item yang terdapat :" + item.getName());
        System.out.println("Total Item :" + totalItem);
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Status :" + status);
    }
}
