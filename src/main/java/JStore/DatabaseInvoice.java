package JStore;

import java.util.ArrayList;

/**
 * Merupakan Class DatabaseInvoice.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID =0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
    }


    public static Invoice getInvoice(int id){
        for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getId() == id ){
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice (Invoice invoice)
            throws InvoiceAlreadyExistsException{
        for(Invoice temp : INVOICE_DATABASE){
            if(invoice.getCustomer() == temp.getCustomer() && invoice.getItem() == temp.getItem()){
                throw new InvoiceAlreadyExistsException(invoice);
//                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer)
            throws CustomerDoesntHaveActiveException{
        ArrayList<Invoice> res = new ArrayList<Invoice>();
        for(Invoice invoice : INVOICE_DATABASE){
            if( (invoice.getCustomer().getId() == customer.getId())  && ((invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoice.getInvoiceStatus() == InvoiceStatus.Installment)) ){
                res.add(invoice);
            }
        }
        if(res.size() > 0){
            return res;
        }
        else{
            throw new CustomerDoesntHaveActiveException(customer);
//            return null;
        }

    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoiceDB.getId() == id)
            {
                if (invoiceDB.getIsActive() == true)
                {
                    invoiceDB.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoiceDB);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}
