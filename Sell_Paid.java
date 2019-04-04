/**
 * Merupakan Class Sell_Paid.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Paid extends Invoice
{
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;

    
    /**
     * Constructor for objects of class Sell_Paid
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.customer=customer;
    } 
    /**
     * Method of class Sell_Paid
     * @return id
     */

    public Customer getCustomer()
    {
        // return dari accessor 
        return customer;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        // return dari accessor 
        return INVOICE_STATUS;
    }
    /**
     * Method of class Sell_Paid
     * @return id
     */
    public InvoiceType getInvoiceType()
    {
        // return dari accessor 
        return INVOICE_TYPE;
    }

    public void setCustomer(Customer customer)
    {
        // initialise instance variables
        this.customer=customer;
    }

    /**
     * Method of class Invoice
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
    }
}