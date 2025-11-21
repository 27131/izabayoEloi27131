package id27131.q10;

public class Invoice extends Entity {
    private double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate, double totalAmount) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (totalAmount <= 0) throw new OrderDataException("Total amount must be greater than 0");
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() { return totalAmount; }
}
