package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account a) {

        System.out.println("\n----- TRANSACTION REPORT -----");

        System.out.println("Account Number: " + a.getAccountNumber());

        System.out.println("Balance: " + a.getBalance());

        System.out.println("------------------------------");
    }
}