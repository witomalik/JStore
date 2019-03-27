
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
    public static void orderNewItem(Item item)
    {
        // 
        Invoice buyPaid1 = new Buy_Paid(1, item, "27 Maret 2019", 250000, item.getPrice());
        if (buyPaid1 instanceof Sell_Paid){
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }else{
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void orderSecondItem(Item item)
    {
        // return dari accessor 
        Invoice buyPaid1 = new Buy_Paid(1, item, "27 Maret 2019", 250000, item.getPrice());
        if (buyPaid1 instanceof Sell_Paid){
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }else{
            System.out.println("Salah, Invoice Type bukan Sell _Paid");
        }
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void orderRefurbishedItem(Item item)
    {
        // return dari accessor 
        Invoice buyPaid1 = new Buy_Paid(1, item, "27 Maret 2019", 250000, item.getPrice());
        if (buyPaid1 instanceof Sell_Paid){
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }else{
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemPaid(Item item)
    {
        // return dari accessor 
        Invoice sellPaid1 = new Sell_Paid(1, item, "27 Maret 2019", 250000, item.getPrice());
        sellPaid1.printData();
        item.printData();
    }
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemUnpaid(Item item)
    {
        // return dari accessor 
        Invoice sellUnpaid1 = new Sell_Unpaid(1, item, "27 Maret 2019", 250000, item.getPrice(), "30 Desember 2019");
        sellUnpaid1.printData();
        item.printData();
    }
    
    /**
     * Method of class Transaction
     * @return void
     */
    public static void sellItemInstallment(Item item)
    {
        // return dari accessor 
        Invoice sellInstallment1 = new Sell_Installment(1, item, "27 Maret 2019", 250000, item.getPrice(), 24);
        ((Sell_Installment) sellInstallment1).setInstallmentPrice();
        ((Sell_Installment) sellInstallment1).setTotalPrice();
        sellInstallment1.printData();
        item.printData();
    }
}
