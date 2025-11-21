package id27131.q6;

public class Transaction extends Entity {
    private String transactionId;
    private double amount;
    private String transactionType;

    public Transaction(int id, String createdDate, String updatedDate, String transactionId, double amount, String transactionType) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (transactionId == null || transactionId.isEmpty()) throw new BankingDataException("Transaction ID cannot be empty");
        if (amount <= 0) throw new BankingDataException("Amount must be > 0");
        if (transactionType == null || transactionType.isEmpty()) throw new BankingDataException("Transaction type cannot be empty");
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public String getTransactionType() { return transactionType; }
}
