package id27131.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        setAgentName(agentName);
        setEmail(email);
        setLicenseNumber(licenseNumber);
    }

    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) throws RealEstateDataException {
        if (agentName == null || agentName.trim().isEmpty())
            throw new RealEstateDataException("Agent name required");
        this.agentName = agentName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^(.+)@(.+)$"))
            throw new RealEstateDataException("Valid email required");
        this.email = email;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) throws RealEstateDataException {
        if (licenseNumber == null || licenseNumber.trim().isEmpty())
            throw new RealEstateDataException("License number required");
        this.licenseNumber = licenseNumber;
    }
}
