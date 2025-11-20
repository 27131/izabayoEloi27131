package id27131.q6;

public class Account extends Bank {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, double balance, String accountType) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        setAccountNumber(accountNumber);
        setBalance(balance);
        setAccountType(accountType);
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) throws BankDataException {
        if (accountNumber == null || accountNumber.trim().isEmpty())
            throw new BankDataException("Account number required");
        this.accountNumber = accountNumber;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) throws BankDataException {
        if (balance < 0) throw new BankDataException("Balance ≥ 0");
        this.balance = balance;
    }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) throws BankDataException {
        if (accountType == null || accountType.trim().isEmpty())
            throw new BankDataException("Account type required");
        this.accountType = accountType;
    }
}
