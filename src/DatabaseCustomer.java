import java.util.ArrayList;

public class DatabaseCustomer {
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer)
    {
        for (Customer customer1 : CUSTOMER_DATABASE){
            if (customer1.getName().equals(customer.getName())&& customer1.getName().equals(customer.getEmail())){
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID=customer.getId();
        return true;

    }

    public static Customer getCustomer(int id)
    {
        for (Customer customer: CUSTOMER_DATABASE){
            if (customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id)
    {
        for (Customer customer: CUSTOMER_DATABASE){
            if (customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        return false;
    }
}
