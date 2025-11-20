package id27131.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // in years

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, double balance, String accountType,
                String customerName, String email, String phoneNumber,
                String transactionId, double amount, String transactionType,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber, transactionId, amount, transactionType, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate);
        setLoanAmount(loanAmount);
        setInterestRate(interestRate);
        setDuration(duration);
    }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) throws BankDataException {
        if (loanAmount <= 0) throw new BankDataException("Loan > 0");
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) throws BankDataException {
        if (interestRate <= 0) throw new BankDataException("Interest rate > 0");
        this.interestRate = interestRate;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) throws BankDataException {
        if (duration <= 0) throw new BankDataException("Duration > 0");
        this.duration = duration;
    }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
}
