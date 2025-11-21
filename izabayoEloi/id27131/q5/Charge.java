package id27131.q5;

public class Charge {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(double rentalCharge, double penaltyCharge) throws RentalDataException {
        if (rentalCharge < 0) throw new RentalDataException("Rental charge cannot be negative");
        if (penaltyCharge < 0) throw new RentalDataException("Penalty charge cannot be negative");
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}
