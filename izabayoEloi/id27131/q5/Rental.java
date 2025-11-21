package id27131.q5;

public class Rental extends Entity {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate, String rentalDate, String returnDate, int rentalDays) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (rentalDate == null || rentalDate.isEmpty()) throw new RentalDataException("Rental date cannot be empty");
        if (returnDate == null || returnDate.isEmpty()) throw new RentalDataException("Return date cannot be empty");
        if (rentalDays <= 0) throw new RentalDataException("Rental days must be > 0");
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public String getRentalDate() { return rentalDate; }
    public String getReturnDate() { return returnDate; }
    public int getRentalDays() { return rentalDays; }
}
