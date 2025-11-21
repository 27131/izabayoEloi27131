package id27131.q9;

public class Invoice extends Entity {
    private double totalFare;

    public Invoice(int id, String createdDate, String updatedDate, double totalFare) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (totalFare <= 0) throw new TicketDataException("Total fare must be greater than 0");
        this.totalFare = totalFare;
    }

    public double getTotalFare() { return totalFare; }
}
