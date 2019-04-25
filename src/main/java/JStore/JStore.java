package JStore;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

/**
 * Write a description of class JStore here.
 *
 * @author Muhammad Wito Malik
 * @version 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) throws SupplierAlreadyExistsException, CustomerAlreadyExistsException, ItemAlreadyExistsException, InvoiceAlreadyExistsException {
        SpringApplication.run(JStore.class, args);

    }
    
    public void JStore(){
        //
    }

}


