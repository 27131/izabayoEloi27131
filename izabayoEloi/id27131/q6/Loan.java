package id27131.q6;

public class Loan extends Entity {
    private double loanAmount;
    private double interestRate;
    private int duration; // months

    public Loan(int id, String createdDate, String updatedDate, double loanAmount, double interestRate, int duration) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (loanAmount <= 0) throw new BankingDataException("Loan amount must be > 0");
        if (interestRate <= 0) throw new BankingDataException("Interest rate must be > 0");
        if (duration <= 0) throw new BankingDataException("Duration must be > 0");
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100.0;
    }
}
