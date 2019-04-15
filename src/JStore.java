import java.util.ArrayList;

/**
 * Write a description of class JStore here.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //
        Location location1 = new Location("Depok", "Jawa Barat", "Kota Belimbing");
        //Supplier supplier1 = new Supplier(1, "Wito", "wito@gmail.com", "012345", location1);
        DatabaseSupplier.addSupplier(new Supplier(1, "Wito", "wito@gmail.com", "+622123456789", location1));
        DatabaseSupplier.addSupplier(new Supplier(2, "Malik", "malik@gmail.com", "+622123456879", location1));
        DatabaseSupplier.addSupplier(new Supplier(3, "Ganteng", "ganteng@gmail.com", "+622123456987", location1));

        System.out.println("\nSupplier");
        for (Supplier supplier1: DatabaseSupplier.getSupplierDatabase()
             ) {
            System.out.println(supplier1);
        }

        DatabaseCustomer.addCustomer(new Customer("Woti", "wotimalik@gmail.com", "wotimalik", "Witokeren123", 1, 1998, 6, 20));
        DatabaseCustomer.addCustomer(new Customer("Muhammad", "mmalik@gmail.com", "wotimalik", "Witokeren123", 2, 1998, 6, 20));
        DatabaseCustomer.addCustomer(new Customer("Keren", "kerenwito@gmail.com", "wotimalik", "Witokeren123", 3, 1998, 6, 20));

        System.out.println("\nCustomer");
        for (Customer customer1: DatabaseCustomer.getCustomerDatabase()
        ) {
            System.out.println(customer1);
        }

        DatabaseItem.addItem(new Item(1, "Keyboard", 530, ItemStatus.New, 2400, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        DatabaseItem.addItem(new Item(2, "Monitor", 430, ItemStatus.New, 2100, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        DatabaseItem.addItem(new Item(3, "Trackpad", 330, ItemStatus.New, 1400, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));

        System.out.println("\nDatabase");
        for (Item item1: DatabaseItem.getItemDatabase()
        ) {
            System.out.println(item1);
        }

        ArrayList<Integer> items1 = new ArrayList<>();
        items1.add(1);
        items1.add(2);

        ArrayList<Integer> items2 = new ArrayList<>();
        items2.add(2);

        ArrayList<Integer> items3 = new ArrayList<>();
        items3.add(3);
        items3.add(2);

        DatabaseInvoice.addInvoice(new Sell_Paid(items1, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(items2, 24, DatabaseCustomer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Unpaid(items3, DatabaseCustomer.getCustomer(3)));

        System.out.println("\nInvoice");
        for (Invoice invoice1 : DatabaseInvoice.getInvoiceDatabase()
        ) {
            System.out.println(invoice1);
        }

        System.out.println("\nFinished");
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));
        System.out.println("Finish Result : " + Transaction.finishTransaction(DatabaseInvoice.getInvoice(3)));

        /*Item item1 = new Item(1, "HandPhone", 500000, ItemStatus.New, 100000, supplier1, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);

        Transaction.orderNewItem(item1);
        System.out.println("\n Sell Item Paid");
        
        System.out.println("\n Sell Item Installment");
        Transaction.sellItemInstallment(item1);*/
        
        
    }
    
    public void JStore(){
        //
    }

}


