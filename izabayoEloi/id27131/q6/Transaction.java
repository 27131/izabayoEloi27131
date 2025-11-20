package id27131.q6;

public class Transaction extends Customer {
    private String transactionId;
    private double amount;
    private String transactionType;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, double balance, String accountType,
                       String customerName, String email, String phoneNumber,
                       String transactionId, double amount, String transactionType) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber);
        setTransactionId(transactionId);
        setAmount(amount);
        setTransactionType(transactionType);
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) throws BankDataException {
        if (transactionId == null || transactionId.trim().isEmpty())
            throw new BankDataException("Transaction ID required");
        this.transactionId = transactionId;
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) throws BankDataException {
        if (amount <= 0) throw new BankDataException("Amount > 0");
        this.amount = amount;
    }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) throws BankDataException {
        if (transactionType == null || transactionType.trim().isEmpty())
            throw new BankDataException("Transaction type required");
        this.transactionType = transactionType;
    }
}
