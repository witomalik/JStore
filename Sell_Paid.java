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
    
    /**
     * Constructor for objects of class Sell_Paid
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Sell_Paid(int id, Item item, String date, int totalItem, int totalPrice)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
    } 
    /**
     * Method of class Sell_Paid
     * @return id
     */
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