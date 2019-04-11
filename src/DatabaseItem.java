
/**
 * Merupakan Class DatabaseItem.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseItem
{
    // variabel yang digunakan dalam class
    private Invoice[] listItem;
    //public static Item itemDB;
    
    /**
     * Method of class DatabaseItem
     * @return true
     */
    public static boolean addItem(Item item)
    {
        // return dari accessor 
        //itemDB=item;
        return true;
    }
    
    /**
     * Method of class DatabaseItem
     * @return true
     */
    public static boolean removeItem(Item itemDB)
    {
        // return dari accessor 
        return true;
    }
    
    /**
     * Method of class DatabaseItem
     * @return item
     */
    //public Item getItem()
    //{
        // return dari accessor 
        //return itemDB;
    //}
    
    /**
     * Method of class DatabaseItem
     * @return listItem
     */
    public Invoice[] getItemDatabase(){
        // return dari accessor 
        return listItem;
    }
    
}
