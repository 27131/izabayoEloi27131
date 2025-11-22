package id27131.q5;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) throws RentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
              branchName, locationCode, vehicleType, registrationNumber, dailyRate,
              customerName, licenseNumber, contactNumber,
              rentalDate, returnDate, rentalDays);
        if (rentalCharge < 0) throw new RentalException("Rental charge cannot be negative");
        if (penaltyCharge < 0) throw new RentalException("Penalty charge cannot be negative");
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }

    public double calculateTotalCharge() {
        return rentalCharge + penaltyCharge;
    }
}
