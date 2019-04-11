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
        Supplier supplier1 = new Supplier(1, "Wito", "wito@gmail.com", "012345", location1);
        Item item1 = new Item(1, "HandPhone", 500000, ItemStatus.New, 100000, supplier1, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);

        Transaction.orderNewItem(item1);
        System.out.println("\n Sell Item Paid");
        
        System.out.println("\n Sell Item Installment");
        Transaction.sellItemInstallment(item1);
        
        
    }
    
    public void JStore(){
        //
    }

}


