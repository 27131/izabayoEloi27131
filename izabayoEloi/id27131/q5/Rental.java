package id27131.q5;

public class Rental extends Customer {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
              branchName, locationCode, vehicleType, registrationNumber, dailyRate,
              customerName, licenseNumber, contactNumber);
        setRentalDate(rentalDate);
        setReturnDate(returnDate);
        setRentalDays(rentalDays);
    }

    public String getRentalDate() { return rentalDate; }
    public void setRentalDate(String rentalDate) throws RentalDataException {
        if (rentalDate == null || rentalDate.trim().isEmpty())
            throw new RentalDataException("Rental date required");
        this.rentalDate = rentalDate;
    }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) throws RentalDataException {
        if (returnDate == null || returnDate.trim().isEmpty())
            throw new RentalDataException("Return date required");
        this.returnDate = returnDate;
    }

    public int getRentalDays() { return rentalDays; }
    public void setRentalDays(int rentalDays) throws RentalDataException {
        if (rentalDays <= 0) throw new RentalDataException("Rental days > 0");
        this.rentalDays = rentalDays;
    }
}
