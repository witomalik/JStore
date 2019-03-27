/**
 * Merupakan Class Sell_Installment.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Sell_Installment extends Invoice
{
    // variabel yang digunakan dalam class
    private static final InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    
    /**
     * Constructor for objects of class Sell_Installment
     * @param id
     * @param item
     * @param date
     * @param totalPrice
     */
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod=installmentPeriod;
    } 
    /**
     * Method of class Sell_Installment
     * @return id
     */
    public int getInstallmentPeriod()
    {
        // return dari accessor 
        return installmentPeriod;
    }
    /**
     * Method of class Sell_Installment
     * @return id
     */
    public int getInstallmentPrice()
    {
        // return dari accessor 
        return installmentPrice;
    }
    /**
     * Method of class Sell_Installment
     * @return id
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // return dari accessor 
        return INVOICE_STATUS;
    }
    /**
     * Method of class Sell_Installment
     * @return id
     */
    public InvoiceType getInvoiceType()
    {
        // return dari accessor 
        return INVOICE_TYPE;
    }
    /**
     * Method of class Sell_Installment
     * @param id
     */
    public void setInstallmentPrice()
    {
        // initialise instance variables
        double result;
        result = (totalPrice/installmentPeriod * 1.02); 
        this.installmentPrice=(int)result;
    }
    /**
     * Method of class Sell_Installment
     * @param id
     */
    public void setTotalPrice()
    {
        // initialise instance variables
        double result;
        result = (installmentPrice*installmentPeriod); 
        this.totalPrice=(int)result;
    }
    /**
     * Method of class Invoice
     * fungsi untuk print variable 
     */
    public void printData(){
        //prints out variable totalPrice
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item :" + getItem().getName());
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Invoice Status :" + getInvoiceStatus());
        System.out.println("Invoice Type :" + getInvoiceType());
        System.out.println("Installment Price :" + getInstallmentPrice());
    }
}