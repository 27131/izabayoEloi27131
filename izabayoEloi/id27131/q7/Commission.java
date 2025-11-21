package id27131.q7;

public class Commission extends Entity {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, String createdDate, String updatedDate, double price, double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (commissionRate < 0) throw new RealEstateDataException("Commission rate must be ≥ 0");
        this.commissionRate = commissionRate;
        this.commissionAmount = (price * commissionRate) / 100;
    }

    public double getCommissionRate() { return commissionRate; }
    public double getCommissionAmount() { return commissionAmount; }
}
