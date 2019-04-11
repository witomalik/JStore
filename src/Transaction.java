
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    public Transaction()
    {
        
    }

    public static void orderNewItem (Item item)
    {
//        Invoice buypaid1 = new Buy_Paid(1, item, "27 Maret 2019", 2, item.getPrice());
/*
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("\nBenar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("\nSalah, Invoice Type bukan Sell_Paid");
        }
        buypaid1.printData();
        item.printData();*/
    }
    
    public static  void orderSecondItem (Item item)
    {
        /*Invoice buypaid1 = new Buy_Paid(2, item, "27 Maret 2019", 13, item.getPrice());

        
        buypaid1.printData();
        
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("\nBenar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("\nSalah, Invoice Type bukan Sell_Paid");
        }*/
    }
    
    public static  void orderRefurbishedItem (Item item)
    {
        /*Invoice buypaid1 = new Buy_Paid(3, item, "27 Maret 2019", 5, item.getPrice());
   
        buypaid1.printData();
        
        if (buypaid1 instanceof Sell_Paid)
        {
            System.out.println("\nBenar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("\nSalah, Invoice Type bukan Sell_Paid");
        }        */
    }
    
    public static void sellItemPaid (Item item, Customer customer)
    {
       /* Invoice sellpaid1 = new Sell_Paid(2, item, "27 Maret 2019", 2, item.getPrice());
        sellpaid1.printData();
        item.printData();*/

    }
    
    public static void sellItemUnpaid (Item item, Customer customer)
    {
       /* Invoice sellpaid1 = new Sell_Unpaid(2, item, "27 Maret 2019", 2, item.getPrice(), "30 Maret 2019");
        sellpaid1.printData();
        item.printData();*/
    }
    
    public static void sellItemInstallment (Item item)
    {
        /*Invoice sellpaid1 = new Sell_Installment(2, item, "27 Maret 2019", 2, item.getPrice(),14);
        ((Sell_Installment) sellpaid1).setInstallmentPrice();
        ((Sell_Installment) sellpaid1).setTotalPrice();
        sellpaid1.printData();
        item.printData();*/
    }
}
