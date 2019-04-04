/**
 * Merupakan Class Buy_Paid.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Buy_Paid extends Invoice
{
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    
    /**
     * Constructor for objects of class Buy_Paid
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        // initialise instance variables
        super(id, item, totalItem);
    } 
    /**
     * Method of class Buy_Paid
     * @return id
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // return dari accessor 
        return INVOICE_STATUS;
    }
    /**
     * Method of class Buy_Paid
     * @return id
     */
    public InvoiceType getInvoiceType()
    {
        // return dari accessor 
        return INVOICE_TYPE;
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
        System.out.println("Item :" + getItem());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Invoice Status :" + getInvoiceStatus());
        System.out.println("Invoice Type :" + getInvoiceType());
    }
}