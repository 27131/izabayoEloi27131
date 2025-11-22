package id27131.q6;

import java.util.Scanner;

public final class AccountRecord {
    public static void main(String[] args) throws BankingException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWork done by Eloi id:27131\n");// --- Entity ---
        Entity entity = null;
        while (entity == null) {
            try {
                System.out.print("Enter ID (>0): ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Created Date: ");
                String createdDate = sc.nextLine();
                System.out.print("Updated Date: ");
                String updatedDate = sc.nextLine();

                entity = new Entity(id, createdDate, updatedDate);
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Bank ---
        Bank bank = null;
        while (bank == null) {
            try {
                System.out.print("Bank Name: ");
                String bankName = sc.nextLine();
                System.out.print("Branch Code (≥3 chars): ");
                String branchCode = sc.nextLine();
                System.out.print("Bank Address: ");
                String bankAddress = sc.nextLine();

                bank = new Bank(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bankName, branchCode, bankAddress);
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Account ---
        Account account = null;
        while (account == null) {
            try {
                System.out.print("Account Number: ");
                String accountNumber = sc.nextLine();
                System.out.print("Account Type: ");
                String accountType = sc.nextLine();
                System.out.print("Balance (≥0): ");
                double balance = Double.parseDouble(sc.nextLine());

                account = new Account(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        accountNumber, accountType, balance);
            } catch (NumberFormatException e) {
                System.out.println("Balance must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Customer ---
        Customer customer = null;
        while (customer == null) {
            try {
                System.out.print("Customer Name: ");
                String customerName = sc.nextLine();
                System.out.print("Customer Email: ");
                String email = sc.nextLine();
                System.out.print("Customer Phone (10 digits): ");
                String phone = sc.nextLine();

                customer = new Customer(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customerName, email, phone);
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Transaction ---
        Transaction transaction = null;
        while (transaction == null) {
            try {
                System.out.print("Transaction ID: ");
                String transactionId = sc.nextLine();
                System.out.print("Transaction Type: ");
                String transactionType = sc.nextLine();
                System.out.print("Transaction Amount (>0): ");
                double transactionAmount = Double.parseDouble(sc.nextLine());

                transaction = new Transaction(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customer.getCustomerName(), customer.getEmail(), customer.getPhoneNumber(),
                        transactionId, transactionType, transactionAmount);
            } catch (NumberFormatException e) {
                System.out.println("Amount must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Deposit ---
        Deposit deposit = null;
        while (deposit == null) {
            try {
                System.out.print("Deposit Amount (>0): ");
                double depositAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Deposit Date: ");
                String depositDate = sc.nextLine();

                deposit = new Deposit(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customer.getCustomerName(), customer.getEmail(), customer.getPhoneNumber(),
                        transaction.getTransactionId(), transaction.getTransactionType(), transaction.getAmount(),
                        depositAmount, depositDate);
            } catch (NumberFormatException e) {
                System.out.println("Deposit amount must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Withdrawal ---
        Withdrawal withdrawal = null;
        while (withdrawal == null) {
            try {
                System.out.print("Withdrawal Amount (>0): ");
                double withdrawalAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Withdrawal Date: ");
                String withdrawalDate = sc.nextLine();

                withdrawal = new Withdrawal(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customer.getCustomerName(), customer.getEmail(), customer.getPhoneNumber(),
                        transaction.getTransactionId(), transaction.getTransactionType(), transaction.getAmount(),
                        deposit.getDepositAmount(), deposit.getDepositDate(),
                        withdrawalAmount, withdrawalDate);
            } catch (NumberFormatException e) {
                System.out.println("Withdrawal amount must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Loan ---
        Loan loan = null;
        while (loan == null) {
            try {
                System.out.print("Loan Amount (>0): ");
                double loanAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Interest Rate (%): ");
                double interestRate = Double.parseDouble(sc.nextLine());
                System.out.print("Duration (months): ");
                int duration = Integer.parseInt(sc.nextLine());

                loan = new Loan(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customer.getCustomerName(), customer.getEmail(), customer.getPhoneNumber(),
                        transaction.getTransactionId(), transaction.getTransactionType(), transaction.getAmount(),
                        deposit.getDepositAmount(), deposit.getDepositDate(),
                        withdrawal.getWithdrawalAmount(), withdrawal.getWithdrawalDate(),
                        loanAmount, interestRate, duration);
            } catch (NumberFormatException e) {
                System.out.println("Loan amount, interest rate and duration must be numbers");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }

        // --- Payment ---
        Payment payment = null;
        while (payment == null) {
            try {
                System.out.print("Payment Amount (>0): ");
                double paymentAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Payment Date: ");
                String paymentDate = sc.nextLine();

                payment = new Payment(entity.getId(), entity.getCreatedDate(), entity.getUpdatedDate(),
                        bank.getBankName(), bank.getBranchCode(), bank.getAddress(),
                        account.getAccountNumber(), account.getAccountType(), account.getBalance(),
                        customer.getCustomerName(), customer.getEmail(), customer.getPhoneNumber(),
                        transaction.getTransactionId(), transaction.getTransactionType(), transaction.getAmount(),
                        deposit.getDepositAmount(), deposit.getDepositDate(),
                        withdrawal.getWithdrawalAmount(), withdrawal.getWithdrawalDate(),
                        loan.getLoanAmount(), loan.getInterestRate(), loan.getDuration(),
                        paymentAmount, paymentDate);
            } catch (NumberFormatException e) {
                System.out.println("Payment amount must be a number");
            } catch (BankingException e) {
                System.out.println(e.getMessage());
            }
        }


        // --- Display Account Record ---
        System.out.println("\nq6 Done by Eloi id:27131");
        System.out.println("\n=== FINAL ACCOUNT RECORD ===");

        System.out.println("\nEntity Details");
        System.out.println("ID: " + entity.getId());
        System.out.println("Created Date: " + entity.getCreatedDate());
        System.out.println("Updated Date: " + entity.getUpdatedDate());

        System.out.println("\nBank Details");
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Branch Code: " + bank.getBranchCode());
        System.out.println("Address: " + bank.getAddress());

        System.out.println("\nAccount Details");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\nCustomer Details");
        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone: " + customer.getPhoneNumber());

        System.out.println("\nTransaction Details");
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Type: " + transaction.getTransactionType());
        System.out.println("Amount: " + transaction.getAmount());

        System.out.println("\nDeposit Details");
        System.out.println("Deposit Amount: " + deposit.getDepositAmount());
        System.out.println("Deposit Date: " + deposit.getDepositDate());

        System.out.println("\nWithdrawal Details");
        System.out.println("Withdrawal Amount: " + withdrawal.getWithdrawalAmount());
        System.out.println("Withdrawal Date: " + withdrawal.getWithdrawalDate());

        System.out.println("\nLoan Details");
        System.out.println("Loan Amount: " + loan.getLoanAmount());
        System.out.println("Interest Rate: " + loan.getInterestRate());
        System.out.println("Duration: " + loan.getDuration());
        System.out.println("Calculated Interest: " + loan.calculateInterest());

        System.out.println("\nPayment Details");
        System.out.println("Payment Amount: " + payment.getPaymentAmount());
        System.out.println("Payment Date: " + payment.getPaymentDate());
    }
}
