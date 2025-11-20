package id27131.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phone;   // 10 digits
    private String email;   // simple validation

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phone, String email)
            throws HospitalDataException {
        super(id, createdDate, updatedDate);
        setHospitalName(hospitalName);
        setAddress(address);
        setPhone(phone);
        setEmail(email);
    }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) throws HospitalDataException {
        if (hospitalName == null || hospitalName.trim().isEmpty())
            throw new HospitalDataException("Hospital name cannot be empty");
        this.hospitalName = hospitalName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws HospitalDataException {
        if (address == null || address.trim().isEmpty())
            throw new HospitalDataException("Address cannot be empty");
        this.address = address;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) throws HospitalDataException {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new HospitalDataException("Phone must be 10 digits");
        this.phone = phone;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws HospitalDataException {
        if (email == null || !email.contains("@"))
            throw new HospitalDataException("Invalid email");
        this.email = email;
    }
}
