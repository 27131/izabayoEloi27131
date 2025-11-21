package id27131.q4;

public class Bill extends Entity {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate, double roomCharge, double serviceCharge) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (roomCharge < 0) throw new ReservationDataException("Room charge cannot be negative");
        if (serviceCharge < 0) throw new ReservationDataException("Service charge cannot be negative");

        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = generateBill();
    }

    public double generateBill() {
        return roomCharge + serviceCharge;
    }

    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}
