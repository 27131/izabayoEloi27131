package id27131.q6;

public final class AccountRecord extends Payment {
    public AccountRecord(int id, String createdDate, String updatedDate,
                         String bankName, String branchCode, String address,
                         String accountNumber, double balance, String accountType,
                         String customerName, String email, String phoneNumber,
                         String transactionId, double amount, String transactionType,
                         double depositAmount, String depositDate,
                         double withdrawalAmount, String withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, String paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber, transactionId, amount, transactionType,
              depositAmount, depositDate, withdrawalAmount, withdrawalDate,
              loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }
}
