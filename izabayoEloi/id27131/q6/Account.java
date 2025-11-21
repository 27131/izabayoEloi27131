package id27131.q6;

public class Account extends Entity {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate, String accountNumber, String accountType, double balance) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (accountNumber == null || accountNumber.isEmpty()) throw new BankingDataException("Account number cannot be empty");
        if (accountType == null || accountType.isEmpty()) throw new BankingDataException("Account type cannot be empty");
        if (balance < 0) throw new BankingDataException("Balance cannot be negative");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
}
