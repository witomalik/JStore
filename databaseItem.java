
/**
 * Merupakan Class DatabaseItem.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseItem
{
    // variabel yang digunakan dalam class
    private String[] listItem;
    private Item item;
    
    /**
     * Method of class DatabaseItem
     * @return true
     */
    public static boolean addItem(Item item)
    {
        // return dari accessor 
        return true;
    }
    
    /**
     * Method of class DatabaseItem
     * @return true
     */
    public boolean removeItem(Item item)
    {
        // return dari accessor 
        return true;
    }
    
    /**
     * Method of class DatabaseItem
     * @return item
     */
    public Item getItem()
    {
        // return dari accessor 
        return item;
    }
    
    /**
     * Method of class DatabaseItem
     * @return listItem
     */
    public String[] getItemDatabase(){
        // return dari accessor 
        return listItem;
    }
    
}
