package JStore;

/**
 * Enumeration class ItemStatus 
 *
 * @author 
 * @version 1.3
 */
public enum ItemStatus {

    New ("New"),
    Second ("Second"),
    Refurbished ("Refurbished"),
    Sold ("Sold");
 
    private String status;
     
     ItemStatus(String status){
         this.status=status;
     }
     
     public String toString(){
         return status;
     }
 
 }