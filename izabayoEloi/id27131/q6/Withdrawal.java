package id27131.q6;

public class Withdrawal extends Transaction {
    private String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate, String transactionId, double withdrawalAmount, String withdrawalDate) throws BankingDataException {
        super(id, createdDate, updatedDate, transactionId, withdrawalAmount, "Withdrawal");
        if (withdrawalAmount <= 0) throw new BankingDataException("Withdrawal amount must be > 0");
        if (withdrawalDate == null || withdrawalDate.isEmpty()) throw new BankingDataException("Withdrawal date cannot be empty");
        this.withdrawalDate = withdrawalDate;
    }

    public String getWithdrawalDate() { return withdrawalDate; }
}
