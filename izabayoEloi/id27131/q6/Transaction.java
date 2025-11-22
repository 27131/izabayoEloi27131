package id27131.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
              accountNumber, accountType, balance, customerName, email, phoneNumber);
        if (transactionId == null || transactionId.trim().isEmpty()) throw new BankingException("Transaction ID cannot be empty");
        if (transactionType == null || transactionType.trim().isEmpty()) throw new BankingException("Transaction type cannot be empty");
        if (amount <= 0) throw new BankingException("Transaction amount must be greater than 0");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}
