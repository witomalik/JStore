package JStore.controller;
import JStore.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoicecustomer/{id_customer}", method= RequestMethod.GET)
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer){
        try {
            return DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
        } catch (CustomerDoesntHaveActiveException e) {
            e.getExMessage();
            return null;
        }
    }

    @RequestMapping(value = "/invoice/{id_invoice}", method = RequestMethod.GET)
    public Invoice getInvoice(@PathVariable int id_invoice) {
        return DatabaseInvoice.getInvoice(id_invoice);
    }

    @RequestMapping(value="/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                     @RequestParam(value="id_customer") int id_customer
    ){
        Invoice invoice = new Sell_Paid(listItem, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        return invoice;
    }

    @RequestMapping(value="/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                       @RequestParam(value="id_customer") int id_customer
    ){
        Invoice invoice = new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        return invoice;
    }

    @RequestMapping(value="/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                            @RequestParam(value="installmentPeriod") int installmentPeriod,
                                            @RequestParam(value="id_customer") int id_customer
    ){
        Invoice invoice = new Sell_Installment(listItem, installmentPeriod, DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e) {
            e.getExMessage();
        }
        return invoice;
    }

    @RequestMapping(value="/canceltransaction", method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value="id_invoice") int id_invoice){
        Invoice temp = DatabaseInvoice.getInvoice(id_invoice);
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(id_invoice));
        return temp;
    }

    @RequestMapping(value="/finishtransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value="id_invoice") int id_invoice){
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(id_invoice));
        return DatabaseInvoice.getInvoice(id_invoice);
    }

}
