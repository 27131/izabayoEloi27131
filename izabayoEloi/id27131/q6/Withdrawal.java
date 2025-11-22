package id27131.q6;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
              accountNumber, accountType, balance, customerName, email, phoneNumber,
              transactionId, transactionType, amount, depositAmount, depositDate);
        if (withdrawalAmount <= 0) throw new BankingException("Withdrawal amount must be greater than 0");
        if (withdrawalDate == null || withdrawalDate.trim().isEmpty()) throw new BankingException("Withdrawal date cannot be empty");
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public String getWithdrawalDate() { return withdrawalDate; }
}
