package id27131.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // in years or months depending on your choice

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
              accountNumber, accountType, balance, customerName, email, phoneNumber,
              transactionId, transactionType, amount, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate);
        if (loanAmount <= 0) throw new BankingException("Loan amount must be greater than 0");
        if (interestRate <= 0) throw new BankingException("Interest rate must be greater than 0");
        if (duration <= 0) throw new BankingException("Duration must be greater than 0");
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100.0;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }
}
