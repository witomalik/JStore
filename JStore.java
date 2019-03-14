
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
        Supplier supplier1 = new Supplier(1, "Samsung", "samsung@gmail.com", "012345", location1);
        location1.printData();
        supplier1.printData();
        System.out.println("==========Order New Item=======");
        Transaction.orderNewItem(supplier1);
        System.out.println("==========Order Second Item=======");
        Transaction.orderSecondItem(supplier1);
        System.out.println("==========Order Refurbished Item=======");
        Transaction.orderRefurbishedItem(supplier1);
        System.out.println("==========Item Paid=======");
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        System.out.println("==========Item Unpaid=======");
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        System.out.println("==========Item Installment=======");
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
    }
    
    public void JStore(){
        //
    }

}


