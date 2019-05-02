package JStore;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write a description of class Transaction here.
 *
 * @author Wito
 * @version 14-03-2019
 */

public class Transaction
{
    public static void orderNewItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderSecondItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemPaid(ArrayList<Integer> item_list , Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Paid(item_list, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Unpaid(item_list, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Installment(item_list,10,customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static boolean finishTransaction(Invoice invoice){
        for (Invoice invo : DatabaseInvoice.getInvoiceDatabase()){
            if(invo == invoice){
                if (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) || invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)){
                    invoice.setIsActive(false);
                    //invoice1.set(i,invoice);
                    //System.out.println(invo.getIsActive());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cancelTransaction(Invoice invoice)
    {
        if(invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)
                || invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid))
        {
            for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase())
            {
                if (invoiceDB.getId() == invoice.getId())
                {
                    try
                    {
                        DatabaseInvoice.removeInvoice(invoice.getId());
                    }
                    catch (InvoiceNotFoundException e)
                    {
                        System.out.println(e.getExMessage());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}