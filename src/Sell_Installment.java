/**
 * Merupakan Class Sell_Installment.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Installment extends Invoice
{
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Installment
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        super(id, item,totalItem);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
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
    
    public void setInstallmentPrice()
    {
        double result;
        result= (totalPrice/installmentPeriod * 1.02);
        this.installmentPrice=(int) result;
    }
   
    public void setTotalPrice()
    {
        double result;
        result= (installmentPrice*installmentPeriod);
        this.totalPrice= (int) result;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
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