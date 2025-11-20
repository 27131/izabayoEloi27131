package id27131.q6;

public class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    public Deposit(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, double balance, String accountType,
                   String customerName, String email, String phoneNumber,
                   String transactionId, double amount, String transactionType,
                   double depositAmount, String depositDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber, transactionId, amount, transactionType);
        setDepositAmount(depositAmount);
        setDepositDate(depositDate);
    }

    public double getDepositAmount() { return depositAmount; }
    public void setDepositAmount(double depositAmount) throws BankDataException {
        if (depositAmount <= 0) throw new BankDataException("Deposit > 0");
        this.depositAmount = depositAmount;
    }

    public String getDepositDate() { return depositDate; }
    public void setDepositDate(String depositDate) throws BankDataException {
        if (depositDate == null || depositDate.trim().isEmpty())
            throw new BankDataException("Deposit date required");
        this.depositDate = depositDate;
    }
}
