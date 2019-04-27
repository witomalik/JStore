package JStore;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Merupakan Class Sell_Installment.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */

    public class Sell_Installment extends Invoice
    {
        // instance variables - replace the example below with your own
        private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
        private int installmentPeriod;
        private int installmentPrice;
        private Customer customer;
        private boolean isActive;

        /**
         * Constructor for objects of class Sell_Installment
         */
        public Sell_Installment(ArrayList<Integer> item,int installmentPeriod, Customer customer)
        {
            super(item);
//        System.out.println(item);
            this.installmentPeriod = installmentPeriod;
            this.customer = customer;
            this.isActive = true;
        }

        public int getInstallmentPeriod(){
            return installmentPeriod;
        }

        public int getInstallmentPrice(){
            return installmentPrice;
        }

        public Customer getCustomer(){
            return customer;
        }

        public InvoiceStatus getInvoiceStatus(){
            return INVOICE_STATUS;
        }

        public InvoiceType getInvoiceType(){
            return INVOICE_TYPE;
        }

        public void setInstallmentPrice(){
            this.installmentPrice = (getTotalPrice() / installmentPeriod) * 102 / 100 ;
        }

        //public void setTotalPrice(){
        // totalPrice=installmentPrice * installmentPeriod;
        //}

        public void setCustomer(Customer customer){
            this.customer = customer;
        }


        public String toString(){
            SimpleDateFormat sdf = new SimpleDateFormat ("dd MMM yyyy");
            setTotalPrice(0);
            setInstallmentPrice();
            for (int bar : getItem()){
                System.out.println(DatabaseItem.getItemFormID(bar));
            }

            return "====Sell Installment=== \nID= "+this.getId()+
                    // "\nItem= "+this.getItem().getId()+
//        "\nAmount "+this.getTotalItem()+
                    "\nBuy Date: "+sdf.format(this.getDate().getTime())+
                    // "\nPrice= "+this.getItem().getPrice()+
                    "\nPrice Total: "+getTotalPrice()+
                    "\nInstallment price: "+getInstallmentPrice()+
                    // "\nSupplier Id: "+this.getItem().getSupplier().getId()+
                    // "\nSupplier Name= "+ this.getItem().getSupplier().getName() +
                    "\nCustomer ID= "+ getCustomer().getId() +
                    "\nCustomer Name= "+ getCustomer().getName() +
                    "\nStatus: " + InvoiceStatus.Installment +
                    "\nSell Success\n";
        }
}