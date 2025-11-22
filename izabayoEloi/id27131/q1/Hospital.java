package id27131.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phoneNumber, String email)
            throws HospitalDataException {
        super(id, createdDate, updatedDate);

        if (hospitalName == null || hospitalName.trim().isEmpty())
            throw new HospitalDataException("Hospital name cannot be empty");
        if (address == null || address.trim().isEmpty())
            throw new HospitalDataException("Hospital address cannot be empty");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        if (email == null || !email.contains("@"))
            throw new HospitalDataException("Email must contain '@'");
        
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
