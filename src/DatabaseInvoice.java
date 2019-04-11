
/**
 * Merupakan Class DatabaseInvoice.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseInvoice
{
    // variabel yang digunakan dalam class
    private Invoice[] listInvoice; // inisialisasi variabel
    private Invoice invoice;
    
    /**
     * Method of class DatabaseInvoice
     * @return true
     */
    public static boolean addInvoice(Invoice invoice)
    {
        // return dari accessor 
        return true;
    }

    public void removeInvoice(Invoice invoice)
    {
        // return dari accessor 
        this.invoice=invoice;
    }
    
    
    /**
     * Method of class DatabaseInvoice
     * @return supplier
     */
    public Invoice getInvoice()
    {
        // return dari accessor 
        return invoice;
    }
    
    /**
     * Method of class DatabaseInvoice
     * @return listSupplier
     */
    public Invoice[] getListInvoice(){
        // return dari accessor 
        return listInvoice;
    }
}
