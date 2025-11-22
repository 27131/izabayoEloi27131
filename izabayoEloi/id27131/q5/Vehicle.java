package id27131.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws RentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        if (vehicleType == null || vehicleType.trim().isEmpty())
            throw new RentalException("Vehicle type cannot be empty");
        if (registrationNumber == null || registrationNumber.trim().isEmpty())
            throw new RentalException("Registration number cannot be empty");
        if (dailyRate <= 0)
            throw new RentalException("Daily rate must be greater than 0");
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
}
