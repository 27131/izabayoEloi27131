package id27131.q6;

public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
              accountNumber, accountType, balance, customerName, email, phoneNumber,
              transactionId, transactionType, amount, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) throw new BankingException("Payment amount must be greater than 0");
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new BankingException("Payment date cannot be empty");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }
}
