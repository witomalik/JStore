package JStore;

public class CustomerAlreadyExistsException extends Exception
{
    private Customer customer_error;

    public CustomerAlreadyExistsException(Customer customer_input)
    {
        super("Customer Email: ");
        customer_error = customer_input;
    }

    /**
     *
     * @return
     */
    public String getExMessage()
    {
        return super.getMessage() + customer_error.getEmail() + ", or username: " + customer_error.getUsername() + " already exists.";
    }
}