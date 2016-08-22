package tiyinc.noobs;

import java.util.ArrayList;

/**
 * Created by bearden-tellez on 8/22/16.
 */
public class Customer {
    private String userName;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }



}
