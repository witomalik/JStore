
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
        Location kantorDepok = new Location("Depok", "Jawa Barat", "Dibawah Jaksel");
        Supplier zeky = new Supplier(1,"Zeky", "zeky@gmail.com", "021345", kantorDepok);
        Item chiki = new Item(1, "Chiki Zeky Kari Ayam", 50, 1500, "chiki", zeky);
        Invoice belanja = new Invoice(1, chiki, "11 Maret 2019", 75000);
        
        zeky.printData();
        zeky.setName("Nanda");
        zeky.printData();
        
        chiki.printData();
        
        DatabaseSupplier.addSupplier(zeky);
        DatabaseItem.addItem(chiki);
    }
    
    public void JStore(){
    }

}


