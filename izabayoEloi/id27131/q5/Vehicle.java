package id27131.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        setVehicleType(vehicleType);
        setRegistrationNumber(registrationNumber);
        setDailyRate(dailyRate);
    }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) throws RentalDataException {
        if (vehicleType == null || vehicleType.trim().isEmpty())
            throw new RentalDataException("Vehicle type required");
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) throws RentalDataException {
        if (registrationNumber == null || registrationNumber.trim().isEmpty())
            throw new RentalDataException("Registration number required");
        this.registrationNumber = registrationNumber;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) throws RentalDataException {
        if (dailyRate <= 0) throw new RentalDataException("Daily rate > 0");
        this.dailyRate = dailyRate;
    }
}
