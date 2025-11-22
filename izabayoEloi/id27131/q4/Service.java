package id27131.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate);
        if (serviceName == null || serviceName.trim().isEmpty()) throw new ReservationException("Service name cannot be empty");
        if (serviceCost <= 0) throw new ReservationException("Service cost must be > 0");
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public double getServiceCost() { return serviceCost; }
}
