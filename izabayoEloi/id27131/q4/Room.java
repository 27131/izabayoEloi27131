package id27131.q4;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (roomNumber <= 0) throw new ReservationException("Room number must be > 0");
        if (roomType == null || roomType.trim().isEmpty()) throw new ReservationException("Room type cannot be empty");
        if (pricePerNight <= 0) throw new ReservationException("Price must be > 0");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}
