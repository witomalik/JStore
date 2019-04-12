import java.util.ArrayList;

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
    private boolean isActive;

    public Buy_Paid(ArrayList<Integer> item) {
        super(item);
        this.isActive = false;
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public String toString(){
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