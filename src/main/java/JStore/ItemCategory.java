package JStore;

/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

public enum ItemCategory {

    Electronics ("Electronics"),
    Furniture ("Furniture"),
    Stationery ("Stationery");
 
    private String cat;
     
     ItemCategory(String cat){
         this.cat=cat;
     }
     
     public String toString(){
         return cat;
     }
 
 }