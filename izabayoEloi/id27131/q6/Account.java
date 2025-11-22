package id27131.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (accountNumber == null || accountNumber.trim().isEmpty()) throw new BankingException("Account number cannot be empty");
        if (accountType == null || accountType.trim().isEmpty()) throw new BankingException("Account type cannot be empty");
        if (balance < 0) throw new BankingException("Balance cannot be negative");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
}
