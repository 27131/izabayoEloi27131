package id27131.q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Created Date: ");
            String createdDate = sc.nextLine();

            System.out.print("Enter Updated Date: ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter Bank Name: ");
            String bankName = sc.nextLine();

            System.out.print("Enter Branch Code: ");
            String branchCode = sc.nextLine();

            System.out.print("Enter Bank Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Account Number: ");
            String accountNumber = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Account Type: ");
            String accountType = sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter Customer Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Customer Phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter Transaction ID: ");
            String transactionId = sc.nextLine();

            System.out.print("Enter Transaction Amount: ");
            double transactionAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Transaction Type: ");
            String transactionType = sc.nextLine();

            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Deposit Date: ");
            String depositDate = sc.nextLine();

            System.out.print("Enter Withdrawal Amount: ");
            double withdrawalAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Withdrawal Date: ");
            String withdrawalDate = sc.nextLine();

            System.out.print("Enter Loan Amount: ");
            double loanAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Interest Rate (%): ");
            double interestRate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Loan Duration (years): ");
            int duration = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Payment Amount: ");
            double paymentAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Payment Date: ");
            String paymentDate = sc.nextLine();

            AccountRecord record = new AccountRecord(
                    id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, balance, accountType,
                    customerName, email, phone,
                    transactionId, transactionAmount, transactionType,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate
            );

            System.out.println("\n--- Account Record ---");
            System.out.println("Bank: " + record.getBankName() + " | Branch: " + record.getBranchCode());
            System.out.println("Account: " + record.getAccountNumber() + " | Type: " + record.getAccountType());
            System.out.println("Balance: " + record.getBalance());
            System.out.println("Customer: " + record.getCustomerName() + " | Email: " + record.getEmail() + " | Phone: " + record.getPhoneNumber());
            System.out.println("Transaction: " + record.getTransactionType() + " | Amount: " + record.getAmount() + " | ID: " + record.getTransactionId());
            System.out.println("Deposit: " + record.getDepositAmount() + " on " + record.getDepositDate());
            System.out.println("Withdrawal: " + record.getWithdrawalAmount() + " on " + record.getWithdrawalDate());
            System.out.println("Loan: " + record.getLoanAmount() + " | Interest Rate: " + record.getInterestRate() + "% | Duration: " + record.getDuration() + " years");
            System.out.println("Calculated Interest: " + record.calculateInterest());
            System.out.println("Payment: " + record.getPaymentAmount() + " on " + record.getPaymentDate());

        } catch (BankDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
