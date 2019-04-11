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
    public Sell_Paid(int id, Item item,int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer=customer;

    }

    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public String toString()
    {
        return "===== INVOICE =====" + 
            "ID: "+this.getId() + 
            "Item: "+this.getItem().getName() + 
            "Amount:" +this.getTotalItem()+ 
            "Buy Date: "+this.getDate().getTime() + 
            "Price: " + this.getItem().getPrice()+ 
            "Price total: " +this.getTotalPrice() + 
            "Supplier ID: " +this.getItem().getSupplier().getId()+ 
            "Supplier name: " +this.getItem().getSupplier().getName()+ 
            "Customer ID: " +this.getCustomer().getId()+ 
            "Customer name: " +this.getCustomer().getName()+
            "status: "+this.INVOICE_STATUS +"Sell success"; 
    }
}