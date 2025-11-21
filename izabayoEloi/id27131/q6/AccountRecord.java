package id27131.q6;

import java.util.Scanner;

public final class AccountRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = null;
        Account account = null;
        Customer customer = null;
        Deposit deposit = null;
        Withdrawal withdrawal = null;
        Loan loan = null;
        Payment payment = null;

        // ===== Bank =====
        while (bank == null) {
            try {
                System.out.print("Bank Name: ");
                String name = sc.nextLine();
                System.out.print("Branch Code: ");
                String branchCode = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();
                bank = new Bank(1, "2025-11-21", "2025-11-21", name, branchCode, address);
            } catch (BankingDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // ===== Account =====
        while (account == null) {
            try {
                System.out.print("Account Number: ");
                String accNo = sc.nextLine();
                System.out.print("Account Type: ");
                String type = sc.nextLine();
                System.out.print("Balance: ");
                double balance = Double.parseDouble(sc.nextLine());
                account = new Account(1, "2025-11-21", "2025-11-21", accNo, type, balance);
            } catch (BankingDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Balance must be a number");
            }
        }

        // ===== Customer =====
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String cName = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Phone (10 digits): ");
                String phone = sc.nextLine();
                customer = new Customer(1, "2025-11-21", "2025-11-21", cName, email, phone);
            } catch (BankingDataException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        System.out.println("\n=== Account Details ===");
        System.out.println("Bank: " + bank.getBankName() + " | Branch: " + bank.getBranchCode());
        System.out.println("Customer: " + customer.getCustomerName() + " | Account: " + account.getAccountNumber() + " | Balance: " + account.getBalance());
    }
}
