package id27131.q6;

public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, double balance, String accountType,
                   String customerName, String email, String phoneNumber,
                   String transactionId, double amount, String transactionType,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType,
              customerName, email, phoneNumber, transactionId, amount, transactionType,
              depositAmount, depositDate, withdrawalAmount, withdrawalDate,
              loanAmount, interestRate, duration);
        setPaymentAmount(paymentAmount);
        setPaymentDate(paymentDate);
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) throws BankDataException {
        if (paymentAmount <= 0) throw new BankDataException("Payment > 0");
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws BankDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new BankDataException("Payment date required");
        this.paymentDate = paymentDate;
    }
}
