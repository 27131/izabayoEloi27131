package id27131.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost)
            throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate);
        setServiceName(serviceName);
        setServiceCost(serviceCost);
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) throws ReservationDataException {
        if (serviceName == null || serviceName.trim().isEmpty())
            throw new ReservationDataException("Service name required");
        this.serviceName = serviceName;
    }

    public double getServiceCost() { return serviceCost; }
    public void setServiceCost(double serviceCost) throws ReservationDataException {
        if (serviceCost <= 0) throw new ReservationDataException("Service cost > 0");
        this.serviceCost = serviceCost;
    }
}
