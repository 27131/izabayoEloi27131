package id27131.q1;

public class Hospital {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(String hospitalName, String address, String phoneNumber, String email) throws HospitalDataException {
        if (hospitalName == null || hospitalName.trim().isEmpty())
            throw new HospitalDataException("Hospital name cannot be empty");
        this.hospitalName = hospitalName;

        if (address == null || address.trim().isEmpty())
            throw new HospitalDataException("Hospital address cannot be empty");
        this.address = address;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        this.phoneNumber = phoneNumber;

        if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new HospitalDataException("Invalid email format");
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
