import java.util.Calendar;

/**
 * Merupakan Class Sell_Unpaid.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Unpaid extends Invoice
{
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;

    
    /**
     * Constructor for objects of class Sell_Unpaid
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.customer=customer;
        this.dueDate=dueDate;
    } 
    /**
     * Method of class Sell_Unpaid
     * @return id
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // return dari accessor 
        return INVOICE_STATUS;
    }
    /**
     * Method of class Sell_Unpaid
     * @return id
     */
    public InvoiceType getInvoiceType()
    {
        // return dari accessor 
        return INVOICE_TYPE;
    }
    /**
     * Method of class Sell_Unpaid
     * @return id
     */
    public Customer getCustomer()
    {
        // return dari accessor 
        return customer;
    }

    public Calendar getDueDate()
    {
        // return dari accessor 
        return dueDate;
    }

    public void setCustomer(Customer customer)
    {
        // initialise instance variables
        this.customer=customer;
    }

    public void setDueDate(Calendar dueDate)
    {
        // initialise instance variables
        this.dueDate=dueDate;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    }
   
    
    /**
     * Method of class Sell_Unpaid
     * fungsi untuk print variable 
     */
    public void printData(){
        //prints out variable totalPrice
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item :" + getItem().getName());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Invoice Status :" + getInvoiceStatus());
        System.out.println("Invoice Type :" + getInvoiceType());
        System.out.println("Due Date :" + getDueDate());
    }
}