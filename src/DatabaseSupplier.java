import java.util.ArrayList;

/**
 * Merupakan Class DatabaseSupplier.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseSupplier
{
    // variabel yang digunakan dalam class
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierID(){
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier) {
        String email = supplier.getEmail();
        String name = supplier.getName();
        String phoneNumber = supplier.getPhoneNumber();
        for (Supplier supplier1 : SUPPLIER_DATABASE) {
            if (name == supplier.getName()) {
                return false;
            }
            if (email == supplier.getEmail()) {
                return false;
            }
            if (phoneNumber == supplier.getPhoneNumber()) {
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }

    public Supplier getSupplier(int id) {
        for (Supplier supplier : SUPPLIER_DATABASE) {
            if (supplier.getId() == id) {
                return supplier;
            }
        }
        return null;
    }

    public boolean removeSupplier(int id) {
        for (Supplier supplier : SUPPLIER_DATABASE) {
            if (supplier.getId() == id) {
                return true;
            }
        }
        return false;
    }

}
