import java.util.*;
import java.text.*;
import java.lang.*;
import java.util.regex.*;

/**
 * Merupakan Class Customer.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class Customer
{ 
    // variabel yang digunakan dalam class
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     * @param 
     * @param 
     * @param 
     * @param 
     * @param 
     * @param 
     * @param 
     */
    public Customer(String name, String email, String username, String password, int id, Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        this.birthDate=birthDate;
        this.birthDate.add(Calendar.MONTH, -1);
    }

    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        this.birthDate=new GregorianCalendar(year,month-1,dayOfMonth);
    }
    
    
    /**
     * Method of class Customer
     * @return name
     */
    public String getName()
    {
        // return dari accessor 
        return name;
    }

    /**
     * Method of class Customer
     * @return name
     */
    public String getEmail()
    {
        // return dari accessor 
        return email;
    }

    /**
     * Method of class Customer
     * @return name
     */
    public String getUsername()
    {
        // return dari accessor 
        return username;
    }

    /**
     * Method of class Customer
     * @return name
     */
    public String getPassword()
    {
        // return dari accessor 
        return password;
    }
    
    /**
     * Method of class Customer
     * @return stock
     */
    public int getId()
    {
        // return dari accessor 
        return id;
    }
    
    /**
     * Method of class Customer
     * @return price
     */
    public Calendar getBirthDate()
    {
        // return dari accessor 
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String bds = sdf.format(birthDate.getTime());
        System.out.println("Birth date : " + bds);
        return birthDate;

    }
    
    
    /**
     * Method of class Customer
     * @param name
     */
    public void setName(String name)
    {
        // initialise instance variables
        this.name=name;
    }
    
    /**
     * Method of class Customer
     * @param name
     */
    public void setEmail(String email)
    {
        // initialise instance variables
        
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
    }

    /**
     * Method of class Customer
     * @param name
     */
    public void setUsername(String username)
    {
        // initialise instance variables
        this.username=username;
    }

    /**
     * Method of class Customer
     * @param name
     */
    public void setPassword(String password)
    {
        // initialise instance variables
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    
    /**
     * Method of class Customer
     * @param id
     */
    public void setId(int id)
    {
        // initialise instance variables
        this.id=id;
    }
    
    /**
     * Method of class Customer
     * @param stock
     */
    public void setBirthDate(Calendar birthDate)
    {
        // initialise instance variables
        this.birthDate=birthDate;
    }

    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.birthDate=new GregorianCalendar(year,month,dayOfMonth);
    }
    
    
    /**
     * Method of class Customer
     * fungsi untuk print variable name
     */
    public String toString(){
        //
        return "\n Id: "+id+"\n Nama: "+name+"\n Username: "+username+"\n Email: "+email+"\n Password: "+password;
    }
    
    
}
