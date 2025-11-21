package id27131.q2;

public class School {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(String schoolName, String address, String phoneNumber, String email) throws SchoolDataException {
        if (schoolName == null || schoolName.trim().isEmpty())
            throw new SchoolDataException("School name cannot be empty");
        this.schoolName = schoolName;

        if (address == null || address.trim().isEmpty())
            throw new SchoolDataException("Address cannot be empty");
        this.address = address;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new SchoolDataException("Phone number must be exactly 10 digits");
        this.phoneNumber = phoneNumber;

        if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new SchoolDataException("Invalid email format");
        this.email = email;
    }

    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
