import java.util.ArrayList;

/**
 * Merupakan Class DatabaseItem.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class DatabaseItem
{
    // variabel yang digunakan dalam class
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;
    //public static Item itemDB;

    public static ArrayList<Item> getItemDatabase(){
        return ITEM_DATABASE;
    }

    public static int getLastItemID(){
        return LAST_ITEM_ID;
    }

    public static boolean addItem(Item item)
    {
        ITEM_DATABASE.add(item);
        return true;
    }

    public static Item getItemFormID(int id){
        for (Item item : ITEM_DATABASE) {
            if (id == item.getId()) {
                return item;
            }
        }
        return null;
    }

    public static ArrayList<Item> getItemFormSupplier(Supplier supplier) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item item : ITEM_DATABASE) {
            if (supplier.equals(item.getSupplier())) {
                temp.add(item);
            }
        }
        if(temp.size()>0){
            return temp;
        }
        else {
            return null;
        }
    }

    public static ArrayList<Item> getItemFormCategory(ItemCategory category) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item item : ITEM_DATABASE) {
            if (category.equals(item.getSupplier())) {
                temp.add(item);
            }
        }
        if(temp.size()>0){
            return temp;
        }
        else {
            return null;
        }
    }

    public static ArrayList<Item> getItemFormStatus(ItemStatus status) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item item : ITEM_DATABASE) {
            if (status.equals(item.getSupplier())) {
                temp.add(item);
            }
        }
        if(temp.size()>0){
            return temp;
        }
        else {
            return null;
        }
    }

    public static boolean removeItem(int id){
        for (Item item : ITEM_DATABASE) {
            if (id == item.getId()) {
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
        return false;
    }

}
