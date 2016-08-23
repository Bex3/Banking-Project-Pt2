package tiyinc.noobs;

import java.util.ArrayList;

/**
 * Created by bearden-tellez on 8/22/16.
 */
public class BankAccount {
    private String name;
    private int type;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void printInfo(){
        System.out.println("Account name: " + name);
    }
}
