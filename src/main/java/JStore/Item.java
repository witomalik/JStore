package JStore;

import java.util.ArrayList;

/**
 * Merupakan Class Item.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Item
{ 
    // variabel yang digunakan dalam class
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    

    /**
     * Constructor for objects of class Item
     * @param id
     * @param name
     * @param status
     * @param price
     * @param supplier
     * @param category
     */
    public Item(int id, String name, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        // initialise instance variables
        this.id=id;
        this.name=name;
        this.status=status;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
    }
    
    /**
     * Method of class Item
     * @return id
     */
    public int getId()
    {
        // return dari accessor 
        return id;
    }
    
    /**
     * Method of class Item
     * @return name
     */
    public String getName()
    {
        // return dari accessor 
        return name;
    }
    
    /**
     * Method of class Item
     * @return stock
     */

    /**
     * Method of class Item
     * @return price
     */
    public int getPrice()
    {
        // return dari accessor 
        return price;
    }
    
    /**
     * Method of class Item
     * @return category
     */
    public ItemCategory getCategory()
    {
        // return dari accessor 
        return category;
    }
    
    public ItemStatus getStatus()
    {
        // return dari accessor 
        return status;
    }
    
    /**
     * Method of class Item
     * @return supplier
     */
    public Supplier getSupplier()
    {
        // return dari accessor 
        return supplier;
    }
    
    /**
     * Method of class Item
     * @param id
     */
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    /**
     * Method of class Item
     * @param name
     */
    public void setName(String name)
    {
        // initialise instance variables
        this.name=name;
    }
    
    /**
     * Method of class Item
     * @param stock
     */

    /**
     * Method of class Item
     * @param price
     */
    public void setPrice(int price)
    {
        // initialise instance variables
        this.price=price;
    }
    
    /**
     * Method of class Item
     * @param category
     */
    public void setCategory(ItemCategory category)
    {
        // initialise instance variables
        this.category=category;
    }
    
    /**
     * Method of class Item
     * @param
     */
    public void setStatus(ItemStatus status)
    {
        // initialise instance variables
        this.status=status;
    }
    
    /**
     * Method of class Item
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        // initialise instance variables
        this.supplier=supplier;
    }
    
    /**
     * Method of class Item
     * fungsi untuk print variable name
     */

    public String toString(){
        return "\n Id: "+id+"\n Name: "+name+"\n Category: "+category+"\n Status: "+status+"\n Supplier: "+supplier.getName();
    }
    
    
}
