import java.util.ArrayList;

/**
 * Merupakan Class DatabaseInvoice.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        // return dari accessor
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID=invoice.getId();
        return true;
    }

    public static Invoice getInvoice(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                return invoice;
            }
        }
        return null;
    }

    public static Invoice getActiveOrder(Customer customer)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (customer == invoice.getCustomer() && invoice.getIsActive()==true && (invoice.getInvoiceStatus()==InvoiceStatus.Unpaid||invoice.getInvoiceStatus()==InvoiceStatus.Installment )) {
                return invoice;
            }
        }
        return null;
    }

    public static boolean removeInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                if (invoice.getIsActive()==true) {
                    invoice.setIsActive(false);
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Method of class DatabaseInvoice
     * @return listSupplier
     */

}
