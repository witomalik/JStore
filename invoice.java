import java.util.*;

/**
 * Merupakan Class Invoice.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public abstract class Invoice
{
    // variabel yang digunakan dalam class
    private int id;
    private Item item;
    private Calendar date;
    private int totalPrice;
    private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;

    /**
     * Constructor for objects of class Invoice
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Invoice(int id, Item item, int totalItem)
    {
        // initialise instance variables
        this.id=id;
        this.item=item;
        this.totalItem=item.getPrice() * totalItem;
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
    public Calendar getDate()
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
    public abstract InvoiceStatus getInvoiceStatus();

    public abstract InvoiceType getInvoiceType();
    
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
    public void setItem(Item item)
    {
        // initialise instance variables
        this.item=item;
    }
    
    /**
     * Method of class Invoice
     * @param date
     */
    public void setDate(Calendar date)
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
        this.totalPrice = item.getPrice() * totalItem;
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

    public abstract InvoiceStatus setInvoiceStatus(InvoiceStatus status);
    
    /**
     * Method of class Invoice
     * fungsi untuk print variable totalPrice
     */
    public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "status: " + this.INVOICE_STATUS
                + "Buy success";
    }
}
