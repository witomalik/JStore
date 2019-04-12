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
            protected ArrayList<Integer> item;
            protected int totalPrice;
            private Calendar date;
            private boolean isActive;
            private Customer customer;

        public Invoice(ArrayList<Integer> item)
        {
            this.id = DatabaseInvoice.getLastInvoiceID() + 1;
            setItem(item);
            //date = GregorianCalendar.getInstance();
        }
        
        public int getId()
        {
            return id;
        }
        
        public ArrayList<Integer> getItem()
        {
            return item;
        }
        
        public Calendar getDate()
        {
            return date;
        }
        
        public int getTotalPrice()
        {
            return totalPrice;
        }
        
        public abstract InvoiceStatus getInvoiceStatus();
        
        public abstract InvoiceType getInvoiceType();

        public boolean getIsActive()
        {
            return isActive;
        }

        public Customer getCustomer()
            {
                return customer;
            }

        public void setId (int id)
        {
            this.id=id;
        }

        public void setItem (ArrayList<Integer> item)
        {
            this.item=item;
        }

        public void setDate (Calendar date)
        {
            this.date=date;
        }

        public void setTotalPrice (int totalPrice) {
            totalPrice=totalPrice;
        }

        public void setInvoiceStatus (InvoiceStatus status) {

        }

        public void setIsActive (boolean isActive){
            this.isActive=true;
        }

        public abstract String toString();

}
