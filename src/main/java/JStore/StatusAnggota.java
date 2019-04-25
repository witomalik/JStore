package JStore;

/**
 * Enumeration class StatusAnggota - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusAnggota
{
    Active("Active"), 
    Inactive("Inactive"), 
    Out("Out");
    
    private String status;
    
    StatusAnggota(String status){
        this.status=status;
    }
    
    public String toString(){
        return status;
    }
    
}
