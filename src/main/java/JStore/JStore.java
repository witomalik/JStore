package JStore;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

/**
 * Write a description of class JStore here.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) throws SupplierAlreadyExistsException, CustomerAlreadyExistsException, ItemAlreadyExistsException, InvoiceAlreadyExistsException {
        SpringApplication.run(JStore.class, args);
        Location location1 = new Location("Depok", "Jawa Barat", "Kota Belimbing");
        Supplier sup1 = new Supplier("Muhammad", "mu@gmail.com", "+62987654321", location1);
        try {
            DatabaseSupplier.addSupplier(sup1);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup2 = new Supplier("Wito", "wi@gmail.com", "+62987654323", location1);
        try {
            DatabaseSupplier.addSupplier(sup2);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }
        Supplier sup3 = new Supplier("Malik", "ma@ui.ac.id", "62987654325", location1);
        try {
            DatabaseSupplier.addSupplier(sup3);
        }
        catch (SupplierAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Ipad", ItemStatus.New, 34098, DatabaseSupplier.getSupplier(1),ItemCategory.Electronics));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }
        try{
            DatabaseItem.addItem(new Item("Sarasa", ItemStatus.New, 12451, DatabaseSupplier.getSupplier(2),ItemCategory.Stationery));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Meja", ItemStatus.New, 567436, DatabaseSupplier.getSupplier(3),ItemCategory.Furniture));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }

        try{
            DatabaseItem.addItem(new Item("Charger", ItemStatus.New, 434234, DatabaseSupplier.getSupplier(3),ItemCategory.Electronics));
        }
        catch (ItemAlreadyExistsException e){
            System.out.println(e);
        }


        /*try{
            DatabaseCustomer.addCustomer(new Customer("Udin", "udin@email.com", "udinpetot", "Udin12345",1990, 15, 20));
        }
        catch (CustomerAlreadyExistsException e){
            System.out.println(e);
        }

         */

    }


    
    public void JStore(){
        //
    }

}


