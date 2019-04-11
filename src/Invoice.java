        import java.util.*;
        import java.util.Calendar;
        import java.util.GregorianCalendar;
        
        /**
         * Merupakan Class Invoice.
         *
         * @author Muhammad Wito Malik
         * @version 28/02/2019
         */
        public abstract class Invoice
        {
            // variabel yang digunakan dalam class
            private int id;
            private Item item;
            private Calendar date;
            protected int totalPrice;
            private int totalItem;
            //private InvoiceStatus status;
            //private InvoiceType type;
        
            /**
             * Constructor for objects of class Invoice
             * @param id
             * @param item
             * @param date
         * @param totalPrice
         */
        public Invoice(int id, Item item, int totalItem )
        {
            this.id=id;
            this.item=item;
            this.totalItem=totalItem;
            totalPrice=item.getPrice()*this.totalItem;
            setTotalPrice(totalPrice);
            date = GregorianCalendar.getInstance();
        }
        
        /**
         * This method is used to get the ID of the item
         * @return  id    this is the id of the item
         * @param
         */
        
        public int getId()
        {
            return id;
        }
        
        /**
         * This method is used to get the informations of the item 
         * @return  item        variable refering to the item class
         */
        
        public Item getItem()
        {
            return item;
        }
        
        /**
         * This method is used to get the date of the transaction
         * @return  date    date of the transaction
         */
        
        public Calendar getDate()
        {
            return date;
        }
        
        /**
         * This method is used to return the total of the price
         * @return  totalPrice     the total price
         */
        
        public int getTotalPrice()
        {
            return totalPrice;
        }
        
        public int getTotalItem()
        {
            return totalItem;
        }
        
        public abstract InvoiceStatus getInvoiceStatus();
        
        public abstract InvoiceType getInvoiceType();
        
        /**
         * Gives the id of the item 
         * @param   id      the integer number representing the identifier 
         *                  of the item
         */
     
        
        public void setId (int id)
        {
            this.id=id;
        }
        
        /**
         * Gives the Item informations
         * @param   item     informations regarding the said item (refering to class Item)
         */
        
        public void setItem (Item item)
        {
            this.item=item;
        }
        
        /**
         * Gives the date of the transaction
         * @param   date     the date of the transaction
         */
        
        public void setDate (Calendar date)
        {
            this.date=date;
        }
        
        /**
         * Set the the total price of the transaction/invoice
         * @param   totalPrice     the total price of the transaction/invoice
         */
        
        public void setTotalPrice (int totalPrice)
        {
            this.totalPrice=totalPrice;
        }
        
        public void setTotalItem (int totalItem)
        {
            this.totalItem=totalItem;
        }
        
    //    public void setInvoiceStatus (InvoiceStatus status)
    //    {
    //        this.status=status;
    //    }
    //
        public abstract String toString();

}
