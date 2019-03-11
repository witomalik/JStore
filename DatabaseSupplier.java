
/**
 * Merupakan Class DatabaseSupplier.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseSupplier
{
    // variabel yang digunakan dalam class
    private String[] listSupplier; // inisialisasi variabel
    private Supplier supplier; // inisialisasi variabel
    
    /**
     * Method of class DatabaseSupplier
     * @return true
     */
    public static boolean addSupplier(Supplier supplier)
    {
        // return dari accessor 
        return true;
    }
    
    /**
     * Method of class DatabaseSupplier
     * @param supplier
     */
    public void removeSupplier(Supplier supplier)
    {
        // initialise instance variables
        this.supplier=supplier;
    }
    
    /**
     * Method of class DatabaseSupplier
     * @return supplier
     */
    public Supplier getSupplier()
    {
        // return dari accessor 
        return supplier;
    }
    
    /**
     * Method of class DatabaseSupplier
     * @return listSupplier
     */
    public String[] getListSupplier(){
        // return dari accessor 
        return listSupplier;
    }
}
