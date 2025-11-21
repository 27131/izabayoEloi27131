package id27131.q4;

public class Service extends Entity {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate, String serviceName, double serviceCost) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (serviceName == null || serviceName.trim().isEmpty())
            throw new ReservationDataException("Service name cannot be empty");
        this.serviceName = serviceName;

        if (serviceCost <= 0)
            throw new ReservationDataException("Service cost must be greater than 0");
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public double getServiceCost() { return serviceCost; }
}
