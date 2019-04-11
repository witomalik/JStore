
/**
 * Write a description of class Anggota here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anggota
{
    // instance variables - replace the example below with your own
    private String nama;
    private StatusAnggota status;
    private String role;

    /**
     * Constructor for objects of class Anggota
     */
    public Anggota(String nama, StatusAnggota status, String role)
    {
        // initialise instance variables
        this.nama=nama;
        this.status=status;
        this.role=role;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNama()
    {
        // put your code here
        return nama;
    }
    
    public StatusAnggota getStatus()
    {
        // put your code here
        return status;
    }
    
    public String getRole()
    {
        // put your code here
        return role;
    }
    
    public void setNama(String nama)
    {
        // put your code here
        this.nama=nama;
    }
    
    public void setStatus(StatusAnggota status)
    {
        // put your code here
        this.status=status;
    }
    
    public void setRole(String role)
    {
        // put your code here
        this.role=role;
    }
    
    public String toString(){
        return (nama + " adalah seorang " + role + " yang berstatus " + status);
    }
}
