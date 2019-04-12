import java.util.ArrayList;

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
    private boolean isActive;

    public Sell_Paid( ArrayList<Integer> item, Customer customer)
    {
        super (item);
        this.isActive=false;
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

    public String toString() {
        StringBuilder total = new StringBuilder();
        for(int a : item){
            Item temp = DatabaseItem.getItemFormID(a);
            String stringTemp = null;
            if (temp != null) {
                stringTemp = temp.toString();
                total.append(stringTemp);
            }
            total.append("\n");
        }
        return total.toString();
    }
}