package id27131.q4;

public class Room extends Entity {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate, String roomNumber, String roomType, double pricePerNight) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (roomNumber == null || roomNumber.trim().isEmpty())
            throw new ReservationDataException("Room number cannot be empty");
        this.roomNumber = roomNumber;

        if (roomType == null || roomType.trim().isEmpty())
            throw new ReservationDataException("Room type cannot be empty");
        this.roomType = roomType;

        if (pricePerNight <= 0)
            throw new ReservationDataException("Price per night must be greater than 0");
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}
