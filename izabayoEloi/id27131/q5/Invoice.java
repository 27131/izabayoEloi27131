package id27131.q5;

public class Invoice {
    private double totalCharge;

    public Invoice(Charge charge) throws RentalDataException {
        if (charge == null) throw new RentalDataException("Charge cannot be null");
        this.totalCharge = calculateTotalCharge(charge);
    }

    private double calculateTotalCharge(Charge charge) {
        return charge.getRentalCharge() + charge.getPenaltyCharge();
    }

    public double getTotalCharge() { return totalCharge; }
}
