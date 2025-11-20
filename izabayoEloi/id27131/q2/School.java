package id27131.q2;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber; // 10 digits
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email)
            throws SchoolDataException {
        super(id, createdDate, updatedDate);
        setSchoolName(schoolName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) throws SchoolDataException {
        if (schoolName == null || schoolName.trim().isEmpty())
            throw new SchoolDataException("School name cannot be empty");
        this.schoolName = schoolName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws SchoolDataException {
        if (address == null || address.trim().isEmpty())
            throw new SchoolDataException("Address cannot be empty");
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws SchoolDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new SchoolDataException("Phone number must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws SchoolDataException {
        if (email == null || !email.contains("@"))
            throw new SchoolDataException("Invalid email");
        this.email = email;
    }
}
