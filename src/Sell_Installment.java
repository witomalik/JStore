import java.util.ArrayList;

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
    private boolean isActive;

    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super (item);
        this.isActive=true;
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
    
    public String toString() {
        StringBuilder total = new StringBuilder();
        for (int a : item) {
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