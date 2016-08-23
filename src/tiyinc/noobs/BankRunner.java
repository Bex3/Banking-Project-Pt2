package tiyinc.noobs;

import java.util.Scanner;

/**
 * Created by bearden-tellez on 8/22/16.
 */
public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Running BankRunner");
        BankRunner runner = new BankRunner();
        runner.startBankingSystem();


    }
    public void startBankingSystem() {
        Scanner inputScanner = new Scanner(System.in);
        Bank myBank = new Bank();

        System.out.println("What's your name?");
        String userName = inputScanner.nextLine();
        if (customerHasExistingAccounts(userName)) {
            retrieveAndDisplayAccountInfo();
        } else {
            BankAccount newAccount = createNewAccount(inputScanner);


            Customer newCustomer = new Customer();
            newCustomer.setUserName(userName);
            newCustomer.addBankAccount(newAccount);
            myBank.addCustomer(new Customer());
        }
        myBank.printInfo();
        System.out.println("Choose the account you would like to do something with. ");
    }

    public boolean customerHasExistingAccounts(String userName) {
         if (userName.equals("Rebecca")) {
             System.out.println("We made it here");
         } return false;
     }

     public void retrieveAndDisplayAccountInfo(){
         System.out.println("Retrieve and display account information");
     }

     public BankAccount createNewAccount(Scanner in){
         System.out.println("Create new account");
         //BankAccount myBankAccount = new BankAccount(String accountName, int accountChoice, double balance); //scope issue new account isn't created yet
         System.out.println("What is the account name?");
         String accountName = in.nextLine();
         System.out.println("What's the type of account?");
         System.out.println("1. Checking");
         System.out.println("2. Savings");
         System.out.println("3. Retirement");
         int accountChoice = Integer.valueOf(in.nextLine());
         System.out.println("Initial balance?");
         double balance = Double.valueOf(in.nextLine());
         String accountTypeString = null;
         if (accountChoice == 1) {
             accountTypeString = "Checking";
         } else if (accountChoice == 2){
             accountTypeString = "Saving";
         } else if (accountChoice==3){
             accountTypeString = "Retirement";
         }

         // put stff in it!!!!!!!!!!!!!
         BankAccount myBankAccount = new BankAccount(accountName, accountChoice, balance);
         myBankAccount.setName(accountName);
         myBankAccount.setType(accountChoice);
         myBankAccount.setBalance(balance);

         myBankAccount.printInfo();
         return myBankAccount; //should return go here or before }
     }






}



