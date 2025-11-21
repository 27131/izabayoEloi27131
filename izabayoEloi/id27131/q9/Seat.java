package id27131.q9;

public class Seat extends Entity {
    private String seatNumber;
    private String seatType;

    public Seat(int id, String createdDate, String updatedDate, String seatNumber, String seatType) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (seatNumber == null || seatNumber.isEmpty()) throw new TicketDataException("Seat number cannot be empty");
        if (!seatType.equals("Economy") && !seatType.equals("Business")) throw new TicketDataException("Seat type must be Economy or Business");
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }
}
