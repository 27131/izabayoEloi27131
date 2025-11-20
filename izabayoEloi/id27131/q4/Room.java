package id27131.q4;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight)
            throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setPricePerNight(pricePerNight);
    }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) throws ReservationDataException {
        if (roomNumber <= 0) throw new ReservationDataException("Room number > 0");
        this.roomNumber = roomNumber;
    }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) throws ReservationDataException {
        if (roomType == null || roomType.trim().isEmpty())
            throw new ReservationDataException("Room type required");
        this.roomType = roomType;
    }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) throws ReservationDataException {
        if (pricePerNight <= 0) throw new ReservationDataException("Price per night > 0");
        this.pricePerNight = pricePerNight;
    }
}
