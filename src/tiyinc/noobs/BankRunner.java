package tiyinc.noobs;

import java.util.Scanner;

/**
 * Created by bearden-tellez on 8/22/16.
 */
public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Running BankRunner");
        BankRunner runner = new BankRunner();
        runner.StartBankingSystem();


    }
    public void StartBankingSystem() {
        Scanner inputScanner = new Scanner(System.in);
        Bank myBank = new Bank();

        System.out.println("What's your name?");
        String userName = inputScanner.nextLine();
        if (customerHasExistingAccounts(userName)) {
            retrieveAndDisplayAccountInfo();
        } else {
            createNewAccount();
            BankAccount newAccount = createNewAccount(inputScanner);
        }

    }
     public boolean customerHasExistingAccounts(String userName) {
         if (userName.equals("Rebecca")) {
             System.out.println("We made it here");
         } return false;
     }

     public void retrieveAndDisplayAccountInfo(){
         System.out.println("Retrieve and display account information");
     }

     public void createNewAccount(Scanner in){
         System.out.println("Create new account");
         BankAccount myBankAccount = new BankAccount();
         System.out.println("What is the account name?");
         String AccountName = in.nextLine();
         System.out.println("What's the type of account?");
         System.out.println("1. Checking");
         System.out.println("2. Savings");
         System.out.println("3. Retirement");
         int accountChoice = Integer.valueOf(in.nextLine());
         System.out.println("Initial balance?");
         double balance = Double.valueOf(in.nextLine());
     }




}



