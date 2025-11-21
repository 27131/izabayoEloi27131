package id27131.q7;

public class Agent extends Entity {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate, String agentName, String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (agentName == null || agentName.isEmpty()) throw new RealEstateDataException("Agent name cannot be empty");
        if (email == null || !email.contains("@")) throw new RealEstateDataException("Invalid email");
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new RealEstateDataException("License number cannot be empty");
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() { return agentName; }
    public String getEmail() { return email; }
    public String getLicenseNumber() { return licenseNumber; }
}
