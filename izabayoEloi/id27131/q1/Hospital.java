package id27131.q1;

import java.util.Date;

public class Hospital extends Entity{
    private String hospitalName;
    private String address;
    private int phoneNumber;
    public String email;
    public Hospital(int id, Date createdDate, Date updatedDate, String hospitalName, String address, int phoneNumber,
            String email) {
        super(id, createdDate, updatedDate);
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
