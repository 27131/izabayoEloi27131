package id27131.q6;

public class Deposit extends Transaction {
    private String depositDate;

    public Deposit(int id, String createdDate, String updatedDate, String transactionId, double depositAmount, String depositDate) throws BankingDataException {
        super(id, createdDate, updatedDate, transactionId, depositAmount, "Deposit");
        if (depositAmount <= 0) throw new BankingDataException("Deposit amount must be > 0");
        if (depositDate == null || depositDate.isEmpty()) throw new BankingDataException("Deposit date cannot be empty");
        this.depositDate = depositDate;
    }

    public String getDepositDate() { return depositDate; }
}
