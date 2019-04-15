import javax.xml.crypto.Data;
import java.util.ArrayList;

/**
 * Write a description of class Transaction here.
 *
 * @author Wito
 * @version 14-03-2019
 */

public class Transaction
{
    public static void orderNewItem(Item item){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderSecondItem(Item item){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderRefurbishedItem(Item item){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemPaid(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Paid(temp, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemUnpaid(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Unpaid(temp, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemInstallment(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Installment(temp,10,customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static boolean finishTransaction(Invoice invoice){
        for (Invoice invo : DatabaseInvoice.getInvoiceDatabase()){
            if(invo == invoice){
                invo.setIsActive(false);
                //invoice1.set(i,invoice);
                //System.out.println(invo.getIsActive());
                return true;
            }
        }
        return false;
    }

    public static boolean cancelTransaction(Invoice invoice){
        for (Invoice invo : DatabaseInvoice.getInvoiceDatabase()){
            if(invo == invoice){
                int id = invo.getId();
                DatabaseInvoice.removeInvoice(invo.getId());
                System.out.println("Invoice " + id + " has been removed");
                return true;
            }
        }
        return false;
    }
}