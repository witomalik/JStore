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
        super(id, item,totalItem);
    }
    
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
        
    
    
/*    public void printData()
    {
           
        //Basic print method to print the value of variable "totalPrice"
        System.out.println ("\n==========SELL PAID==========\n");
        System.out.println ("\n==========INVOICE==========\n");
        System.out.println ("ID                 = " +getId());
        System.out.println ("Tanggal            = " +getDate());
        System.out.println ("Item               = " +getItem().getName());
        //System.out.println ("Total Item= " +totalItem);
        System.out.println ("Status             = " +getInvoiceStatus());
        System.out.println ("Type               = " +getInvoiceType());
        System.out.println ("Total Harga        = " +totalPrice);

        ID =  Item = Amount = Buy date =  Price = Price total = Supplier ID = Supplier name = Status = PAID 
    }*/


  public String toString(){ 
        return "===== INVOICE =====" + 
            "ID: "+this.getId() + 
            "Item: "+this.getItem().getName() + 
            "Amount:" +this.getTotalItem()+ 
            "Buy Date: "+this.getDate().getTime() + 
            "Price: " + this.getItem().getPrice()+ 
            "Price total: " +this.getTotalPrice() + 
            "Supplier ID: " +this.getItem().getSupplier().getId()+ 
            "Supplier name: " +this.getItem().getSupplier().getName()+ 
            "status: "+this.INVOICE_STATUS +"Buy success"; 
    }
}