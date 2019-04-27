
package JStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Merupakan Class Sell_Paid.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
//        System.out.println(item);
        this.customer = customer;
        this.isActive = false;
    }

    public Customer getCustomer(){
        return customer;
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
        setTotalPrice(0);

        for (int bar : this.getItem()){
            System.out.println(DatabaseItem.getItemFormID(bar));
        }

        return "====Sell Paid=== \nID= "+this.getId()+
// "\nItem= "+this.getItem().getId()+
//        "\nAmount "+this.getTotalItem()+
                "\nBuy Date: "+sdf.format(getDate().getTime())+
                // "\nPrice= "+this.getItem().getPrice()+
                "\nPrice Total: "+getTotalPrice()+
                // "\nSupplier Id: "+this.getItem().getSupplier().getId()+
                // "\nSupplier Name= "+ this.getItem().getSupplier().getName() +
                "\nCustomer ID= "+ getCustomer().getId() +
                "\nCustomer Name= "+ getCustomer().getName() +
                "\nStatus: " + InvoiceStatus.Paid +
                "\nSell Success\n";
    }
}
