package id27131.q6;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, double balance, String accountType,
                      String customerName, String email, String phoneNumber,
                      String transactionId, double amount, String transactionType,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber, transactionId, amount, transactionType, depositAmount, depositDate);
        setWithdrawalAmount(withdrawalAmount);
        setWithdrawalDate(withdrawalDate);
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public void setWithdrawalAmount(double withdrawalAmount) throws BankDataException {
        if (withdrawalAmount <= 0) throw new BankDataException("Withdrawal > 0");
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getWithdrawalDate() { return withdrawalDate; }
    public void setWithdrawalDate(String withdrawalDate) throws BankDataException {
        if (withdrawalDate == null || withdrawalDate.trim().isEmpty())
            throw new BankDataException("Withdrawal date required");
        this.withdrawalDate = withdrawalDate;
    }
}
