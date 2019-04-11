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
    private  Customer customer;
   

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer=customer;
        this.dueDate.add(Calendar.DATE, 1);
    }
    
         
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
        
   
    public Calendar getDueDate()
    {
        return dueDate;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }

    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
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
            "status: "+this.INVOICE_STATUS+
            "Due Date: "+this.getDueDate() + "If payment is not received by dueDate, transaction will be cancelled."; 
            
    }
}