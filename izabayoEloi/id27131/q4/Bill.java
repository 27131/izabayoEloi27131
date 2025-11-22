package id27131.q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
              paymentMethod, paymentDate);
        this.roomCharge = pricePerNight;
        this.serviceCharge = serviceCost;
        this.totalBill = generateBill();
    }

    public double generateBill() {
        return roomCharge + serviceCharge;
    }

    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}
