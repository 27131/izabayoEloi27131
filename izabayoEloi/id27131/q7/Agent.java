package id27131.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (agentName == null || agentName.isEmpty()) throw new RealEstateDataException("Agent name required");
        if (!email.matches(".+@.+")) throw new RealEstateDataException("Invalid email");
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new RealEstateDataException("License required");

        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() { return agentName; }
    public String getEmail() { return email; }
    public String getLicenseNumber() { return licenseNumber; }
}
