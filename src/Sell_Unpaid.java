import java.util.ArrayList;
import java.util.Calendar;

/**
 * Merupakan Class Sell_Unpaid.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Unpaid extends Invoice {
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer) {
        super(item);
        this.isActive = true;
        this.customer = customer;
        this.dueDate.add(Calendar.DATE, 1);
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
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