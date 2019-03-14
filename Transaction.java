
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void orderNewItem(Supplier supplier)
    {
        // 
        Item item1 = new Item (1, "Galaxy Spica", 50, ItemStatus.New, 250000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);
        Invoice pesan1 = new Invoice(1, item1, "14 Maret 2019", item1.getPrice(), 5, InvoiceStatus.Unpaid);
        item1.setStatus(ItemStatus.New);
        pesan1.setInvoiceStatus(InvoiceStatus.Unpaid);
        item1.printData();
        pesan1.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void orderSecondItem(Supplier supplier)
    {
        // return dari accessor 
        Item item2 = new Item (1, "Galaxy Spicb", 50, ItemStatus.Second, 250000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item2);
        Invoice pesan2 = new Invoice(2, item2, "14 Maret 2019", item2.getPrice(), 5, InvoiceStatus.Unpaid);
        item2.setStatus(ItemStatus.Second);
        pesan2.setInvoiceStatus(InvoiceStatus.Unpaid);
        item2.printData();
        pesan2.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void orderRefurbishedItem(Supplier supplier)
    {
        // return dari accessor 
        Item item3 = new Item (1, "Galaxy Spicc", 50, ItemStatus.Refurbished, 250000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item3);
        Invoice pesan3 = new Invoice(3, item3, "14 Maret 2019", item3.getPrice(), 5, InvoiceStatus.Unpaid);
        item3.setStatus(ItemStatus.Refurbished);
        pesan3.setInvoiceStatus(InvoiceStatus.Unpaid);
        item3.printData();
        pesan3.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemPaid(Item item)
    {
        // return dari accessor 
        Invoice pesan4 = new Invoice(4, item, "14 Maret 2019", item.getPrice(), 5, InvoiceStatus.Paid);
        pesan4.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        item.printData();
        pesan4.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemUnpaid(Item item)
    {
        // return dari accessor 
        Invoice pesan5 = new Invoice(5, item, "14 Maret 2019", item.getPrice(), 5, InvoiceStatus.Unpaid);
        pesan5.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        item.printData();
        pesan5.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemInstallment(Item item)
    {
        // return dari accessor 
        Invoice pesan6 = new Invoice(6, item, "14 Maret 2019", item.getPrice(), 5, InvoiceStatus.Installment);
        pesan6.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        item.printData();
        pesan6.printData();
    }
}
