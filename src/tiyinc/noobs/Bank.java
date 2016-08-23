package tiyinc.noobs;

import java.util.ArrayList;

/**
 * Created by bearden-tellez on 8/22/16.
 */
public class Bank {
    private ArrayList<Customer> customers = new ArrayList <Customer> ();


    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void addCustomer(Customer customer){
        //customer.addCustomer;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }    //private String bankName;


}
